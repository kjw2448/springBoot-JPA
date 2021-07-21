package com.kim.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kim.blog.model.User;

// User 테이블을 관리하는 repository, primary key = Integer
// DAO
// 자동으로 bean등록 -> @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{

}
