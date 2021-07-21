package com.kim.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
=======
>>>>>>> 92cc3bc30ae1bc5f901a8821fcc8cdf9a09f4ca4
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
<<<<<<< HEAD
import org.hibernate.annotations.DynamicInsert;
=======
>>>>>>> 92cc3bc30ae1bc5f901a8821fcc8cdf9a09f4ca4

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM -> Java(다른언어 포함) Object -> 테이블로 매핑해주는 기술

<<<<<<< HEAD
//@DynamicInsert => insert할때 null인 필드 제외
=======
>>>>>>> 92cc3bc30ae1bc5f901a8821fcc8cdf9a09f4ca4
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User 클래스가 MySQL에 테이블이 생성 된다.
public class User {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30)
	private String username;
	
	@Column(nullable = false, length = 100) // 해쉬로 변경할때를 대비
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
<<<<<<< HEAD
	//@ColumnDefault("'USER'");
	// DB는 RoleType이라는 게 없다.
	@Enumerated(EnumType.STRING) // Enum이 String 타입이라고 알려준다
	private RoleType role; // Enum
=======
	@ColumnDefault("'user'")
	private String role; // Enum
>>>>>>> 92cc3bc30ae1bc5f901a8821fcc8cdf9a09f4ca4
	
	@CreationTimestamp // 시간이 자동으로 입력
	private Timestamp createDate;
	
}
