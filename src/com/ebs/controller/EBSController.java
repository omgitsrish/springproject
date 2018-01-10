package com.ebs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EBSController {
	
	@RequestMapping
	public String showHome() {
		return "index";
	}

}
