package com.kim.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kim.blog.dto.ResponseDto;
import com.kim.blog.model.RoleType;
import com.kim.blog.model.User;
import com.kim.blog.service.UserService;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) {// username, password, email
		user.setRole(RoleType.USER);
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바오브젝트를 JSON으로 변환해서 리턴(Jackson)
	}
}
