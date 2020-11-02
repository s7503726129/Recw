package com.recw.board.vo;

import java.util.Date;

public class BoardVO {
	private Integer board_num;
	private String mem_num;
	private String board_title;
	private String nickname;//작성자
	private Integer board_category;
	private String board_content;
	private Date board_date;
	private String board_count;
	private Integer board_like;
	
	
	
	public Integer getBoard_num() {
		return board_num;
	}
	public void setBoard_num(Integer board_num) {
		this.board_num = board_num;
	}
	public String getMem_num() {
		return mem_num;
	}
	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getBoard_category() {
		return board_category;
	}
	public void setBoard_category(Integer board_category) {
		this.board_category = board_category;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public String getBoard_count() {
		return board_count;
	}
	public void setBoard_count(String board_count) {
		this.board_count = board_count;
	}
	public Integer getBoard_like() {
		return board_like;
	}
	public void setBoard_like(Integer board_like) {
		this.board_like = board_like;
	}
	
	
	
	
}
