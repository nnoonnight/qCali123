package com.group.exam.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.group.exam.member.vo.MemberVO;

@Controller
public class MemberInsertController {

	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public String insert() {
		return "/member/insertForm";
	}
	
	@RequestMapping(value="/member/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute("isnertForm")MemberVO memberVO) {
		return "/member/insertSuccess";
	}
}
