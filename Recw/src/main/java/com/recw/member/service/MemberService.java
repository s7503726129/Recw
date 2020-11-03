package com.recw.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.recw.member.dao.MemberDao;
import com.recw.member.vo.MemberVO;

@Service
public class MemberService implements IMemberService {
	
	@Inject
	private MemberDao dao;

	@Override
	public int reg_Member(MemberVO member) {
		// TODO Auto-generated method stub
		System.out.println("dao service in --------------------");
		System.out.println(member.getEmail());
		System.out.println(member.getPassword());
		System.out.println(member.getNickname());
		System.out.println("dao service out --------------------");
		return dao.reg_Member(member);
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
	


}
