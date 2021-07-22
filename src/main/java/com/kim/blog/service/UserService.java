package com.kim.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kim.blog.model.User;
import com.kim.blog.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록 (IoC) 해준다
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void 회원가입(User user) {
		userRepository.save(user);
	}
	
}
