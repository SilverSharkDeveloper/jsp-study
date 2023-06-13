package com.mybatis.dao;

import com.mybatis.vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO membervo = new MemberVO();
		membervo.setMemberId("hds1234");
		membervo.setMemberPassword("hds1234");
		
		
		MemberDAO dao = new MemberDAO();
//		dao.insert(membervo);
		System.out.println(dao.selectMember("hds1234", "hds1234"));
		
	}
	
}
