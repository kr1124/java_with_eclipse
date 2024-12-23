package com.dbex;

/*
 * jdbc를 이용한 데이터베이스 연결방법
 * 
 * 1단계 : import java.sql.*;
 * 2단계 : 특정 Driver 검색 (버전마다 다를 수 있지만 일단은 이런식임)
 * 			msaccess : sun.jdbc.odbc.JdbcOdbcDriver
 * 			mssql : com.microsoft.sqlserver.jdbc.SQLServerDriver
 * 			mysql : rog.gjt.mm.mysql.Driver (v3)
 * 					com.mysql.jdbc.Driver (v5)
 * 					com.mysql.cj.jdbc.Driver (over v8) 
 * 			mariadb : org.mairadb.jdbc.Driver 
 * 			oracle -> (oracle.jdbc.driver.OracleDriver)
 * 
 * 3단계 : DataBase 연결
 * 
 * 		Connection con = DriverManager.getConnection(url, id, password);
 * 
 * 		URL : 프로토콜 : sub 프로토콜 : File명
 * 
 * 			MS- Access	: jdbc:odbc:OdbcFileName
 * 			MySQL 		: jdbc:mysql://localhost:3306/DBname
 * 			mariaDB		: jdbc:mariadb://localhost:3306/DBname
 * 			MSSQL		: jdbc:sqlserver://localhost:1443/DBname=Name:intergratedSecurity=true
 * 			Oracle		: jdbc:oracle:this:@loaclhost:1521:sid
 * 
 * 4단계 : Query 문 작성
 * 
 * 		- Statement Class(정적)
 * 		-> Statement stmt = con.createStatement();
 * 
 * 		- PreparedStatement Class(동적)
 * 		-> PreparedStatement pstmt = con.prepareStatement(query);
 *  
 * 5단계 : 쿼리를 실행한 결과 저장
 * 		
 * 		정적
 * 		ResultSet rs = stmt.executeQuery(query); -> select문일때
 * 		ResultSet rs = stmt.executeUpdate(query); -> insert, update, delete문일때
 * 
 * 		동적
 * 		ResultSet rs = pstmt.executeQuery(); -> select문일때
 * 		ResultSet rs = pstmt.executeUpdate(); -> insert, update, delete문일때
 * 
 * 6단계 : 사용한 데이터베이스 해제
 * 		rs.close(); //결과 먼저
 * 		stmt.close(); //문장 그다음
 * 		pstmt.close();
 * 		con.close(); //마지막
 * 
 * 
 * */

import java.sql.*;

import buf.cio;

public class JDbcEx01 {

	public static void main(String[] args) {		
		Connection con = null; //연결위치?
		Statement stmt = null;
		
		try {
			//jdbc 드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection 객체 (데이터베이스 연결)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			//cio.wnlf("데이터베이스 연결이 성공적으로 진행되었습니다.");
			
			//statement 객체 얻기
			stmt = con.createStatement();
			
			//sql문 작성
			String sql = "insert into department values(203, '제어계측공학과', 200, '7호관')";
			
			//쿼리 실행
			int result = stmt.executeUpdate(sql);
			
			cio.wnlf(result + "행이 추가 되었습니다.");
			
			
			
			
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
