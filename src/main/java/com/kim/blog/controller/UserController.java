package com.kim.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/joinForm")
	public String joinForm() {
		System.out.println("join controller");
		return "user/joinForm";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		System.out.println("login controller");
		return "user/loginForm";
	}
	
	
}
