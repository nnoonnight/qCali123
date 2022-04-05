package com.group.exam.member.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.group.exam.member.service.MemberService;
import com.group.exam.member.vo.InsertCommand;

@Controller
public class MemberInsertController {
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public String insert(@ModelAttribute("InsertCommand")InsertCommand insertCommand) {
		return "/member/insertForm";
	}
	
	@RequestMapping(value="/member/insert", method=RequestMethod.POST)
	public String insert(@Valid @ModelAttribute("InsertCommand")InsertCommand insertCommand, BindingResult bindingResult) throws Exception, IOException{
		if(bindingResult.hasErrors()) {
			return "/member/insertForm";
		}
		System.out.println(insertCommand);
		
		String encodedPw = passwordEncoder.encode(insertCommand.getmPassword());
		
		insertCommand.setmPassword(encodedPw);
//		if(errors.hasErrors()) {
//			return "/member/insertSuccess";
//		}
		try {
			memberService.insert(insertCommand);
			return "/member/insertSuccess";
		} catch (Exception e) {
			return "/member/insertForm";
		}
		
		
	}
}
