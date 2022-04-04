package com.group.exam.member.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.exam.member.dao.MemberDAOImpl;
import com.group.exam.member.vo.InsertCommand;
import com.group.exam.member.vo.MemberVO;
import com.group.exam.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAOImpl memberDAO;
	
	@Override
	public void insert(InsertCommand insertCommand) {
		
		MemberVo memberVo = new MemberVo();
		memberVo.setmId(insertCommand.getMemberId());
		memberVo.setmPassword(insertCommand.getMemberPw());
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(insertCommand.getMemberBirthDay());//?????????
		
		memberVo.setmBirthday(date);
		memberDAO.insert(memberVo);
 
	}

	@Override
	public int nicknameDup(String member_nickname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int idDup(String member_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void login(MemberVO memberVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendPw(String member_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateCheck(String member_pw) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateNickname(String member_nickname) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePw(String memeber_pw, String mode) {
		// TODO Auto-generated method stub

	}

	@Override
	public List myPost(String member_seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String member_pw) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MemberVO> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
