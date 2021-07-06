package com.springWeb.Controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springWeb.Exception.SpringException;
import com.springWeb.Model.Student;

@Controller
public class StudentController {
	private static Logger log=Logger.getLogger(StudentController.class);
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student() {
		log.info("come into /student");
		log.error("info ");
		return new ModelAndView("student","user",new Student());
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student,ModelMap model) throws IOException {
		log.info("come into /addStudent");
		if(student.getName().length()<5) {
			throw new SpringException("name is too short.please focus this ");
		}
		if(student.getAge()==null) {
			throw new SpringException("null point ,please");
		}
		if(student.getId()==null) {
			throw new SpringException("please input id");
		}
		if(student.getAge()==5) {
			throw new IOException();
		}
		model.addAttribute("name", student.getName());
		model.addAttribute("id", student.getId());
		model.addAttribute("age", student.getAge());
		return "result";
	}
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public String redirect() {
		log.info("come into /redirect");
		return "redirect:finalPage";
	}
	@RequestMapping(value="finalPage",method=RequestMethod.GET)
	public String toFinal() {
		log.info("come into /finalPage");
		return "final";
	}
	

}
