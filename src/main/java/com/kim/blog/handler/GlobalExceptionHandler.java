package com.kim.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 어디서 발생한 exception도 다 받기 위해
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String handleArgumentException(IllegalArgumentException e) {
		return "<h1>" + e.getMessage() + "</h1>";
	}
}
