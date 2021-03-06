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

import com.group.exam.member.service.MailSendService;
import com.group.exam.member.service.MemberService;
import com.group.exam.member.vo.InsertCommand;

@Controller
public class MemberInsertController {
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private MemberService memberService;

	@Autowired
	private MailSendService mss;
	  
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
		
			//비밀번호 암호화
			String encodedPw = passwordEncoder.encode(insertCommand.getmPassword());				
			//암호화한 비번 셋
			insertCommand.setmPassword(encodedPw);
			//insert
			memberService.insert(insertCommand);
			
			//인증 메일을 발송,인증키 6자리 String 반환
			String authKey = mss.sendAuthMail(insertCommand.getmId()); 
			//인증키 셋
			insertCommand.setmAuthkey(authKey);


	      //DB에 인증키 업데이트
	      memberService.updateAuthkey(insertCommand);

			return "/member/emailConfirm";
	}
	
	@ResponseBody
	@RequestMapping(value="/member/idDup",method=RequestMethod.POST)
	public int idDup(@ModelAttribute("InsertCommand")InsertCommand insertCommand) {		
		String mId = insertCommand.getmId();
	
		return memberService.idDup(mId);
			
	}
	
	@ResponseBody
	@RequestMapping(value="/member/nicknameDup",method=RequestMethod.POST)
	public int nicknameDup(@ModelAttribute("InsertCommand")InsertCommand insertCommand) {		
		String mNickname = insertCommand.getmNickname();
		int res = memberService.nicknameDup(mNickname);
		return res;
		
		
	}
	

}
