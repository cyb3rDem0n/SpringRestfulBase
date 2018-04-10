package com.cyberdemon.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyberdemon.framework.model.MyPojoDetails;
import com.cyberdemon.framework.model.MyPojoForm;

@Controller
@RequestMapping("/contacts")
public class ApplicationController {
	
	// handlers for input/output form
	
	@GetMapping("/new")
	public String contactForm(Model model) {
		model.addAttribute(new MyPojoForm());
		return "contact-form";
	}

	@PostMapping("/new")
	public String submitNewContact(@ModelAttribute MyPojoForm myPojoForm, Model model) {
		MyPojoDetails details = new MyPojoDetails();
		details.setFirstName(myPojoForm.getFirstName());
		details.setLastName(myPojoForm.getLastName());
		details.setPhone(myPojoForm.getPhone());

		model.addAttribute("contact", details);
		return "contact-details";
	}

}
