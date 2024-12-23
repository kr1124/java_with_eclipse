package com.dbex;

import java.sql.*;

import buf.cio;

public class JDbcEx02 {
//데이터 수정(update)
	public static void main(String[] args) {
		//학과번호를 조건으로 학과명을 변경 : 제어계측공학과 -> 컴퓨터공학과

		//sql문 작성
		String sql = "update department set dname='컴퓨터공학과' where deptno=203";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//jdbc 드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection 객체 (데이터베이스 연결)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			//cio.wnlf("데이터베이스 연결이 성공적으로 진행되었습니다.");
			
			//statement 객체 얻기
			stmt = con.createStatement();
			
			//쿼리 실행
			int result = stmt.executeUpdate(sql);
			
			cio.wnlf(result + "행이 변경 되었습니다.");
			
			
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {}
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {}
		}
		
	}
	
// 기본 세팅
	
//	public static void main(String[] args) {		
//		Connection con = null; //연결위치?
//		Statement stmt = null;
//		
//		try {
//			
//		} catch (ClassNotFoundException cn) {
//			cn.printStackTrace();
//		} catch (SQLException s) {
//			s.printStackTrace();
//		} finally {
//			try {
//				if(stmt != null) {
//					stmt.close();
//				}
//			} catch (SQLException se) {}
//			try {
//				if(con != null) {
//					con.close();
//				}
//			} catch (SQLException se) {}
//		}
//		
//	}

}
