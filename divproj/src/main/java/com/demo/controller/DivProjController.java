package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DivProjController {

	@ResponseBody
	@RequestMapping(value="/div",method=RequestMethod.GET)
	public String welcome()
	{
		return "Welcome";
	}
}
