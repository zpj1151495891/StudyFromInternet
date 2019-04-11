package com.suray.springStudy.Annotation.JavaBase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
