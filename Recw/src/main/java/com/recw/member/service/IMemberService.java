package com.recw.member.service;

import com.recw.member.vo.MemberVO;

public interface IMemberService {
	
	// 회원등록
	public int reg_Member(MemberVO member);

	// 회원정보보기
	public void read_Member(MemberVO member);

	// 회원 정보 수정
	public void update_Member(MemberVO member);

	// 회원 탈퇴
	public void delete_Member(MemberVO member);

	// 회원 전체 목록
	public void list_Member(MemberVO member);


}
