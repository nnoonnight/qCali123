package member.vo;

import java.util.Date;

public class MemberVO {
	private int member_seq;
	private String member_id ;
	private String member_pw;
	private String member_bpw;
	private String member_nickname;
	private Date member_birth_day;
	private Date reg_date;
	private String member_auth = "F"; //or T
	private String member_authkey;
	private int member_level; 

	
	
	public int getMember_seq() {
		return member_seq;
	}
	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_bpw() {
		return member_bpw;
	}
	public void setMember_bpw(String member_bpw) {
		this.member_bpw = member_bpw;
	}
	public String getMember_nickname() {
		return member_nickname;
	}
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	public Date getMember_birth_day() {
		return member_birth_day;
	}
	public void setMember_birth_day(Date member_birth_day) {
		this.member_birth_day = member_birth_day;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getMember_auth() {
		return member_auth;
	}
	public void setMember_auth(String member_auth) {
		this.member_auth = member_auth;
	}
	public String getMember_authkey() {
		return member_authkey;
	}
	public void setMember_authkey(String member_authkey) {
		this.member_authkey = member_authkey;
	}
	public int getMember_level() {
		return member_level;
	}
	public void setMember_level(int member_level) {
		this.member_level = member_level;
	}

	

}