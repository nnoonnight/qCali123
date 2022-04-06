package com.group.exam.member.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;


public class MemberVo {
	
	private int mSeq;
	private String mId;
	private String mBpassword;
	private String mPassword;
	private String mNickname;
	private Date mBirthday;
	private Date mRegday;
	private String mAuth;
	private String mAuthkey;
	private int mLevel;

	
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getmSeq() {
		return mSeq;
	}

	public void setmSeq(int mSeq) {
		this.mSeq = mSeq;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmBpassword() {
		return mBpassword;
	}

	public void setmBpw(String mBpassword) {
		this.mBpassword = mBpassword;
	}

	public String getmPassword() {
		return mPassword;
	}

	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getmNickname() {
		return mNickname;
	}

	public void setmNickname(String mNickname) {
		this.mNickname = mNickname;
	}

	public Date getmBirthday() {
		return mBirthday;
	}

	public void setmBirthday(Date mBirthday) {
		this.mBirthday = mBirthday;
	}

	public Date getmRegday() {
		return mRegday;
	}

	public void setmRegday(Date mRegday) {
		this.mRegday = mRegday;
	}

	public String getmAuth() {
		return mAuth;
	}

	public void setmAuth(String mAuth) {
		this.mAuth = mAuth;
	}

	public String getmAuthkey() {
		return mAuthkey;
	}

	public void setmAuthkey(String mAuthkey) {
		this.mAuthkey = mAuthkey;
	}

	public int getmLevel() {
		return mLevel;
	}

	public void setmLevel(int mLevel) {
		this.mLevel = mLevel;
	}

	@Override
	public String toString() {
		return "MemberVo [mSeq=" + mSeq + ", mId=" + mId + ", mBpassword=" + mBpassword + ", mPassword=" + mPassword
				+ ", mNickname=" + mNickname + ", mBirthday=" + mBirthday + ", mRegday=" + mRegday + ", mAuth=" + mAuth
				+ ", mAuthkey=" + mAuthkey + ", mLevel=" + mLevel + "]";
	}
	
	
	

}
