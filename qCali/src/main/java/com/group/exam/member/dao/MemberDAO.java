package com.group.exam.member.dao;

import java.util.List;

import com.group.exam.member.vo.MemberVO;

public interface MemberDAO {
	
	//성공시 창 띄울거면 int로 반환해서 어쩌구
	
	public abstract void insert(MemberVO memberVO);//회원가입	
	public abstract int nicknameDup(String member_nickname);//닉네임 중복확인
	public abstract int idDup(String member_id);//id(email) 중복확인
	public abstract void login(MemberVO memberVO);//로그인
	public abstract void sendPw(String member_id);//임시 비번 발송	
	public abstract int updateCheck(String member_pw);//정보수정 입장 전 비번 확인
	public abstract void updateNickname(String member_nickname);//닉네임 중복확인후 변경
	public abstract void updatePw(String memeber_pw, String mode);//비밀번호 변경
	//mode 를 update로 주면 암호화ㅇ / temp로 주면 임시 비번(암호화x) 으로 변경
	public abstract List/*<BoardVO>*/ myPost(String member_seq); //id나 닉네임은 바뀔수도 있으므로seq로 조회
	public abstract void delete(String member_pw);//탈퇴
	
	public List<MemberVO> select(); //정보 조회
	
}
	