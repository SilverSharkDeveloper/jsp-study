package com.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.mybatis.dao.MemberDAO;
import com.mybatis.vo.MemberVO;

public class JoinOkController implements Action{
	
	public JoinOkController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		
		vo.setMemberId(req.getParameter("memberId"));
		vo.setMemberPassword(req.getParameter("memberPassword"));
		dao.insert(vo);
		
		result.setRedirect(true);
		result.setPath(req.getContextPath()+"/joinOk.jsp");
		
		
		return result;
	
	}
}
