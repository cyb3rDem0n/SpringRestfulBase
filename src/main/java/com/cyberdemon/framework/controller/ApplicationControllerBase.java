package com.cyberdemon.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ApplicationControllerBase {
	// handlers for base string output

	@GetMapping
	public ModelAndView unSaluto() {
		// ModelAndView("destination HTML page", "attribute", "attribute value")
		return new ModelAndView("home", "nome", "cyberdemon");
	}

	@RequestMapping("/textresponse")
	@ResponseBody
	String home() {
		return "Forward Slash - Text Response Page!";
	}

	@RequestMapping("/contactme")
	public String contactFunction() {
		return "contactme";
	}

}
