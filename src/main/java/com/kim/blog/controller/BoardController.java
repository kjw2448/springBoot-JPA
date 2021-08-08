package com.kim.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kim.blog.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 컨트롤러에서 세션을 어떻게 찾는지?
	@GetMapping({"/",""})
	public String index(Model model, @PageableDefault(size=3,direction=Sort.Direction.DESC) Pageable pageable) { 
		// index.jsp 페이지로 boards가 model을 타고 넘어간다.
		model.addAttribute("boards", boardService.글목록(pageable));
		return "index"; // viewResolver 작동!! (prefix, suffix 포함)
	}
	
	// USER 권한이 필요
	@GetMapping("/board/saveForm")
	public String saveForm() {
		return "board/saveForm";
	}
}
