package com.suray.springStudy.Annotation.JavaBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppText {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor tx=(TextEditor) context.getBean(TextEditor.class);
		tx.spellChecker();
	}

}
