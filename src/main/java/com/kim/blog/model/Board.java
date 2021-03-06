package com.kim.blog.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int id;
	
	@Column(nullable = false, length = 100)
	private String title;
	
	@Lob // 대용량 데이터
	private String content; // 섬머노트 사용할 것 <html>태그가 섞인다.
	
	
	private int count; // 조회수
	
	@ManyToOne(fetch = FetchType.EAGER) // Many = Board , One = User // 기본전략 EAGER 무조건 들고온다
	@JoinColumn(name="userId")
	private User user; // DB는 오브젝트를 저장할 수 없다.(FK사용),,,,,, 그러나 자바는 오브젝트를 저장할 수 있다.
	
	@OneToMany(mappedBy = "board", fetch =  FetchType.EAGER) // mappedBy 연관관계의 주인이 아니다 (FK키가 아니다) DB에 컬럼을 만들지 말아요
	private List<Reply> reply; // 기본전략 LAZY 필요할때 가져온다
	
	@CreationTimestamp
	private Timestamp createDate;
}
