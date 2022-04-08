package com.group.exam.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.group.exam.member.vo.MemberVo;

//JpaRepository 를 사용하며, 데이터베이스에 CRUD 의 명령을 쿼리 없이 전달하여 실행 가능
@Repository
public class MemberDAOImpl implements MemberDAO {

	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	public MemberDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	
	@Override
	public void insert(MemberVo memberVo) {
		sqlSessionTemplate.insert("insert", memberVo);

	}

	@Override
	public int nicknameDup(String mNickname) {
		return sqlSessionTemplate.selectOne("nicknameDup", mNickname);
	}

	@Override
	public int idDup(String mId) {
		return sqlSessionTemplate.selectOne("idDup", mId);

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
