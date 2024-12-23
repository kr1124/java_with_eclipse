package com.dbex;

import java.sql.*;

import buf.cio;

public class JDbcEx03 {
	//delete
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			String sql = "delete department where dname='컴퓨터공학과'";
						
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			cio.wnlf(result + "행이 삭제 되었습니다.");
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
}
