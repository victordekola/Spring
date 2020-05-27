package com.testebootstrap.aplicationadminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Victor Gomes
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Home()
	{
		return "home";
	}

}
