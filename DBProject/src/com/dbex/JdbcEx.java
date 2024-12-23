package com.dbex;

import java.sql.*;

import buf.cio;

public class JdbcEx {

	public static void main(String[] args) {
		String sql = "select * from dept";	
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "backupuser", "BACKUP1234");
			cio.wnlf("데이터베이스 연결 성공");
			
			/*
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int i = rs.getInt(1);
				String s1 = rs.getString("dname");
				String s2 = rs.getString(3);
				cio.wnlf(i + ", " + s1 + ", " + s2);
			}*/
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException se) {}
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
