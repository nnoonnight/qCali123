package com.group.exam.member.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.exam.member.dao.MemberDAOImpl;
import com.group.exam.member.vo.InsertCommand;
import com.group.exam.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAOImpl memberDAO;
	
	@Override
	public void insert(InsertCommand insertCommand) {
		
		MemberVo memberVo = new MemberVo();
		memberVo.setmId(insertCommand.getmId());
		memberVo.setmPassword(insertCommand.getmPassword());
		memberVo.setmNickname(insertCommand.getmNickname());
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(insertCommand.getmBirthday());
			memberVo.setmBirthday(date);
			System.out.println(memberVo);
			memberDAO.insert(memberVo);
		} catch (ParseException e) {
			//날짜로 형변환 실패
		}
		
 
	}

	@Override
	public int nicknameDup(String mNickname) {
		return memberDAO.nicknameDup(mNickname);
	}

	@Override
	public int idDup(String mId) {	
		return memberDAO.idDup(mId);
	}

	@Override
	public void login(MemberVo memberVo) {
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
	public List<MemberVo> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
