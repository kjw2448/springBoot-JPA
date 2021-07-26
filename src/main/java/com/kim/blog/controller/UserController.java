package com.kim.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	//인증이 완된 사용자들이 출입할 수 있는 경로를 /auth/** 허용
	// 그냥 주소가 / 이면 index.jsp 혀용
	// static이하에 있는 /js/**, /css/**, image/** 허용

	@GetMapping("/auth/joinForm")
	public String joinForm() {
		System.out.println("join controller");
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		System.out.println("login controller");
		return "user/loginForm";
	}
	
	
}
