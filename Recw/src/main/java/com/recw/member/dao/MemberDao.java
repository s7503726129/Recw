package com.recw.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.recw.member.vo.MemberVO;

@Repository
public class MemberDao implements IMemberDao {
	
	@Inject
	private SqlSessionFactory factory;
	
	private static String namespace = "com.recw.mapper.MemberMapper";
	private int n=0;

	@Override
	public int reg_Member(MemberVO member) {
		// TODO Auto-generated method stub
		
		try {
			n=factory.openSession().insert(namespace+"insertMember", member);
		}
		catch (Exception e) {
			// TODO: handle exception
			n=0;
		}
		System.out.println("회원가입 결과 n=1 success ? false " + n);
		return n;
	}

	@Override
	public void read_Member(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_Member(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete_Member(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list_Member(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return factory.openSession().selectOne(namespace+".getTime");
	}

	
	
}
