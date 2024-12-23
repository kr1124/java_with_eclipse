package com.dbex;

import java.sql.*;

import buf.cio;

/*	PreparedStatement는 sql의 형태는 동일하나 조건이나 변수 값이 다른 문장을
 * 바인딩 변수를 사용해 변수 처리함으로써 항상 동일한 sql문을 처리할 수 있다.
 * 
 * PreparedStatement 객체의 생성 및 바인딩 변수의 사용
 * 
 * 바인딩 변수 (?)
 * 	실제값으로 대체될 부분에 사용한다.
 * 
 * 	String sql = "insert into department values(?,?,?,?)";
 *  PreparedStatement pstmt = con.prepareStatement(sql);
 *  
 *  바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해 준다.
 *  pstmt.setInt(1, 200);
 *  pstmt.setSting(2, "생명공학과");
 *  pstmt.setInt(3, 300);
 *  pstmt.setSting(4, "6호관");
 *  
 *  단, 바인딩 변수는 컬럼명에는 절대 사용할 수 없다.
 *  
 *  PreparedStatement는 바인딩 변수값을 지정해주는 setXXX() 메서드를 제공한다.
 * 	
 *  
 * */

public class JDbcEx05 {
	public static void main(String[] args) {
		
//		PreparedStatement를 사용하는 경우
//		쿼리의 실제값으로 대체될 부분을 ?로 처리한다.
//		? : 데이터베이스에서 쿼리 실행시에 실제값으로 대체되서 저장됨
		
		String sql =  "insert into professor values(?,?,?,?,?,sysdate,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql);
			
			
			//바인딩 변수 설정
			//쿼리의 ?(바인딩 변수)에 대체될 값 실제값을 지정
			pstmt.setInt(1,  9920);
			pstmt.setString(2,  "홍길동");
			pstmt.setString(3, "GilDong");
			pstmt.setString(4,  "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 50);
			pstmt.setInt(7, 203);

			pstmt.executeUpdate();
			
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {}
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {}
		}
		
	}
}
