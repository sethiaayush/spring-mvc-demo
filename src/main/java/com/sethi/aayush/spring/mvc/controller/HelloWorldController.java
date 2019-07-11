package com.sethi.aayush.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller method to read data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	// public String letsShoutDude(HttpServletRequest request, Model model) {
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		// read the request parameter from the HTML form
		// String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String message = "Yo! " + theName;

		// add message to the model
		model.addAttribute("message", message);

		return "helloworld";
	}

}
