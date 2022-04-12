package com.group.exam.member.dao;

import java.util.List;

import com.group.exam.member.vo.InsertCommand;
import com.group.exam.member.vo.MemberVo;

public interface MemberDAO {
	
	//성공시 창 띄울거면 int로 반환해서 어쩌구
	
	public abstract void insert(MemberVo memebrVo);//회원가입	
	public abstract int nicknameDup(String mNickname);//닉네임 중복확인
	public abstract int idDup(String mId);//id(email) 중복확인
	public abstract void updateAuthkey(MemberVo memebrVo);//인증메일 발송후 인증키 저장
	public abstract void updateAuth(MemberVo memebrVo);//메일 클릭시 인증 완료
	public abstract void login(MemberVo memberVo);//로그인
	public abstract void sendPw(String mId);//임시 비번 발송	
	public abstract int updateCheck(String mPassword);//정보수정 입장 전 비번 확인
	public abstract void updateNickname(String mNickname);//닉네임 중복확인후 변경
	public abstract void updatePw(String mPassword, String mode);//비밀번호 변경
	//mode 를 update로 주면 암호화ㅇ / temp로 주면 임시 비번(암호화x) 으로 변경
	public abstract List/*<BoardVO>*/ myPost(String mSeq); //id나 닉네임은 바뀔수도 있으므로seq로 조회
	public abstract void delete(String mPassword);//탈퇴
	
	public List<MemberVo> select(); //정보 조회
	
}
	