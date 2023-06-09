package com.whatsappemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppDemoController {

	@GetMapping("/Signinpage/{UserId}")
	public String Signinpage()
	{
		return "Signin page is Successful";
	}
	
	
	@GetMapping("/Landingpage/{Username}")
	public String Landingpage(@PathVariable("Username") String Username)
	{
		return "The Landing page of the user "+Username;
	}
}
