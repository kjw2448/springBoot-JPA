package com.kim.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kim.blog.model.User;

// User 테이블을 관리하는 repository, primary key = Integer
// DAO
// 자동으로 bean등록 -> @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{
	// SELECT * FROM user WHERE username = 1?;
	Optional<User> findByUsername(String username);
}


// JPA Naming 쿼리 전략
// SELECT * FROM user WHERE username = ?1 AND password = ?2;
//User findByUsernameAndPassword(String username, String password);

// native 쿼리 전략
//@Query(value="SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery =  true)
//User login(String username, String password);