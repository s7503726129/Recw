package com.recw.member.dao;

import com.recw.member.vo.MemberVO;

public interface IMemberDao {
	
	public String getTime();
	
	public void memberInsert(MemberVO member);
	
	MemberVO memberSelect(MemberVO member);

}
