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

			String sql = "delete department where dname='��ǻ�Ͱ��а�'";
						
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			cio.wnlf(result + "���� ���� �Ǿ����ϴ�.");
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