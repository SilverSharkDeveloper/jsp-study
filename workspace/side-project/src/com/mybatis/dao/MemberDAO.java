package com.mybatis.dao;


import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MybatisConfig;
import com.mybatis.vo.MemberVO;

public class MemberDAO {
   public SqlSession sqlSession;
   
   public MemberDAO() {
      sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   
   //회원가입
  public void insert(MemberVO membervo) {
	  sqlSession.insert("member.insert",membervo);
  }
   
  public MemberVO selectMember(String id , String password) {
	  Map<String,String> map = new HashMap<>();
	  map.put("id", id);
	  map.put("password", password);	
	  
	  
	  return sqlSession.selectOne("member.selectMember",map);
	  
	  
  }
   
   
}




















