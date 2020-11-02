package com.recw.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.recw.member.vo.MemberVO;

@Repository
public class MemberDao {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.recw.mapper.MemberMapper";
	
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	public void memberInsert(MemberVO member) {
		sqlSession.insert(namespace+".insertMember",member);
	}

	
	
}
