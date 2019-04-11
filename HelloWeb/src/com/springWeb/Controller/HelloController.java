package com.springWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {
	
	//返回hello2.jsp
	@RequestMapping("/hello")
	public String hello(ModelMap model) {
		System.out.println("this is a controller");
		model.addAttribute("message","welcome use Spring mvc");
		return "hello2";
	}
	//返回index.html
	@RequestMapping("/index")
	public String index() {
		System.out.println("this is index");
		return "index";
	}
	//返回对象
	@RequestMapping("/response")
		public @ResponseBody String response(){
		System.out.println("this is response");
		return "this is response";
	}

}
