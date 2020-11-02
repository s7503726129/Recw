package com.recw.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recw.member.service.MemberService;
import com.recw.member.vo.MemberVO;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService service;

	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
	}
	@RequestMapping(value="/terms")
	public String terms() {
		
		return "member/terms";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		
		return "member/login";
	}
	
	@RequestMapping(value = "/joinView", method = RequestMethod.GET)
	public String joinView(MemberVO vo) {
		return "member/join";
	}
	
	
	@RequestMapping(value = "/joinProc", method = RequestMethod.POST)
	public String joinReg(MemberVO member) {
		
		service.reg_Member(member);
		
		return "/member/joinOk";
	}

}
