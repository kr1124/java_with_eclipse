package com.dbex;

import java.sql.*;

import buf.cio;

public class JDbcEx06 {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update professor set sal = ? where name = ?";
			
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql);
			
			//바인딩 변수 설정
			//쿼리의 ?(바인딩 변수)에 대체될 값 실제값을 지정
			pstmt.setInt(1,  500);
			pstmt.setString(2,  "홍길동");
			
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
