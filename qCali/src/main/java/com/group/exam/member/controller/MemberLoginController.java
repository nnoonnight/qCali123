package com.group.exam.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberLoginController {

	@RequestMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	

}
