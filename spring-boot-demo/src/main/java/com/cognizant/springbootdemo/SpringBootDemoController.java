package com.cognizant.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringBootDemoController {

	
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String helloPage()
	{
		return "hello";
	}
	
}
