package com.peterso.gittest.handers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	static final String SUCCESS ="success";
	static final String INDEX ="index";
	
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("Hello World");
		return SUCCESS;
	}

}
