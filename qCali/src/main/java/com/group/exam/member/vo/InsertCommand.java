package com.group.exam.member.vo;

import java.util.Date;

public class InsertCommand {

	private String memberId ;
	private String memberPw;
	private String memberPwCheck;
	private String memberNickname;
	private String memberBirthDay;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberPwCheck() {
		return memberPwCheck;
	}
	public void setMemberPwCheck(String memberPwCheck) {
		this.memberPwCheck = memberPwCheck;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberBirthDay() {
		return memberBirthDay;
	}
	public void setMemberBirthDay(String memberBirthDay) {
		this.memberBirthDay = memberBirthDay;
	}
	@Override
	public String toString() {
		return "InsertCommand [memberId=" + memberId + ", memberPw=" + memberPw + ", memberPwCheck=" + memberPwCheck
				+ ", memberNickname=" + memberNickname + ", memberBirthDay=" + memberBirthDay + "]";
	}

	

}
