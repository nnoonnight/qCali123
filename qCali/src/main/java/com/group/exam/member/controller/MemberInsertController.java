package com.group.exam.member.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.group.exam.member.service.MemberService;
import com.group.exam.member.vo.InsertCommand;
import com.group.exam.member.vo.MemberVO;

@Controller
public class MemberInsertController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public String insert(@ModelAttribute("memberVo")InsertCommand insertCommand, MemberVo memberVo) {
		return "/member/insertForm";
	}
	
	@RequestMapping(value="/member/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute("memberVo")InsertCommand insertCommand, Errors errors) throws Exception, IOException{

		System.out.println(insertCommand);
//		if(errors.hasErrors()) {
//			return "/member/insertSuccess";
//		}
		//try {
			memberService.insert(insertCommand);
			return "/member/insertSuccess";
//		} catch (Exception e) {
//			return "/member/insertSuccess";
//		}
		
		
	}
}
