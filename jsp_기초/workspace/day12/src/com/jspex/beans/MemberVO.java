package com.jspex.beans;

public class MemberVO {
	private Long num;
	private String name;
	private String birthDay;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", name=" + name + ", birthDay=" + birthDay + "]";
	}


	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
}
