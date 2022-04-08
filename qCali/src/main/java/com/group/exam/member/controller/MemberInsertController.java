package com.group.exam.member.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String insert(@Valid @ModelAttribute("InsertCommand")InsertCommand insertCommand, Errors errors) throws Exception, IOException{
		
		if(errors.hasErrors()) {
			return "/member/insertForm";
		}
		System.out.println(insertCommand);
		int idDup = memberService.idDup(insertCommand.getmId());
		//try {
			if(idDup>=1) {
				return "/member/insertForm";
				//throw new AlreadyExistingIdException();
			}else {
				String encodedPw = passwordEncoder.encode(insertCommand.getmPassword());				
				insertCommand.setmPassword(encodedPw);
				memberService.insert(insertCommand);
				//return "/member/insertSuccess";
			}			
			/*
			 * } catch (AlreadyExistingIdException e) { errors.rejectValue("id",
			 * "duplicate"); return "/member/insertForm"; }
			 */
			return "/member/insertSuccess";
	}
	
	@ResponseBody
	@RequestMapping(value="/member/idDup",method=RequestMethod.POST)
	public int idDup(@ModelAttribute("InsertCommand")InsertCommand insertCommand) {		
		String mId = insertCommand.getmId();
		
		
		return memberService.idDup(mId);
		
		
	}
	
//	@RequestMapping("/member/idDup")
//	public int idDup(@RequestParam("mId") String mId) {		
//		return memberService.idDup(mId);
//	}
}
