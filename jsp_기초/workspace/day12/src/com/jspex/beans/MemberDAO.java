package com.jspex.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
		Connection conn;
		PreparedStatement pstm;
		ResultSet rs;
		ResultSetMetaData rsmd;
		
		public void insert(MemberVO memberVO) {
			conn = DBConnector.getConnection();
			String query = "INSERT INTO TBL_MEMBER2(NUM,NAME,BIRTH_DATE) VALUES(SEQ_MEMBER2.NEXTVAL,?,?)";
			try {
				pstm = conn.prepareStatement(query);
				pstm.setString(1, memberVO.getName());
				pstm.setString(2, memberVO.getBirthDay());
				pstm.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs!= null) {
						rs.close();
					}
					if(pstm!= null) {
						pstm.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		//이름으로 전체정보 조회
		public ArrayList<MemberVO> select(String name) {
			ArrayList<MemberVO> members = new ArrayList<>();
			MemberVO member = null;
			
			conn = DBConnector.getConnection();
			String query = "SELECT NUM, NAME,BIRTH_DATE FROM TBL_MEMBER2 WHERE NAME = ?";
			try {
				pstm = conn.prepareStatement(query);
				pstm.setString(1, name);
				rs = pstm.executeQuery();
				
				//int colums = 0, rows =0;
				//컬럼갯수 구하기
//				rsmd = rs.getMetaData();
//				colums = rsmd.getColumnCount();
				//행갯수 구하기
//				rs.last();
//				rows = rs.getRow();
//				rs.beforeFirst();
				while(rs.next()) {
					member = new MemberVO();
					member.setNum(rs.getLong(1));
					member.setName(rs.getString(2));
					member.setBirthDay(rs.getString(3));
					members.add(member);
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("예상치 못한 오류");
			}finally {
				try {
					if(rs!= null) {
						rs.close();
					}
					if(pstm != null) {
						pstm.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
					
				}
			}
			return members;
		}
		
}
