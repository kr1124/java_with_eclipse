package com.dbex;

/*
 * jdbc�� �̿��� �����ͺ��̽� ������
 * 
 * 1�ܰ� : import java.sql.*;
 * 2�ܰ� : Ư�� Driver �˻� (�������� �ٸ� �� ������ �ϴ��� �̷�����)
 * 			msaccess : sun.jdbc.odbc.JdbcOdbcDriver
 * 			mssql : com.microsoft.sqlserver.jdbc.SQLServerDriver
 * 			mysql : rog.gjt.mm.mysql.Driver (v3)
 * 					com.mysql.jdbc.Driver (v5)
 * 					com.mysql.cj.jdbc.Driver (over v8) 
 * 			mariadb : org.mairadb.jdbc.Driver 
 * 			oracle -> (oracle.jdbc.driver.OracleDriver)
 * 
 * 3�ܰ� : DataBase ����
 * 
 * 		Connection con = DriverManager.getConnection(url, id, password);
 * 
 * 		URL : �������� : sub �������� : File��
 * 
 * 			MS- Access	: jdbc:odbc:OdbcFileName
 * 			MySQL 		: jdbc:mysql://localhost:3306/DBname
 * 			mariaDB		: jdbc:mariadb://localhost:3306/DBname
 * 			MSSQL		: jdbc:sqlserver://localhost:1443/DBname=Name:intergratedSecurity=true
 * 			Oracle		: jdbc:oracle:this:@loaclhost:1521:sid
 * 
 * 4�ܰ� : Query �� �ۼ�
 * 
 * 		- Statement Class(����)
 * 		-> Statement stmt = con.createStatement();
 * 
 * 		- PreparedStatement Class(����)
 * 		-> PreparedStatement pstmt = con.prepareStatement(query);
 *  
 * 5�ܰ� : ������ ������ ��� ����
 * 		
 * 		����
 * 		ResultSet rs = stmt.executeQuery(query); -> select���϶�
 * 		ResultSet rs = stmt.executeUpdate(query); -> insert, update, delete���϶�
 * 
 * 		����
 * 		ResultSet rs = pstmt.executeQuery(); -> select���϶�
 * 		ResultSet rs = pstmt.executeUpdate(); -> insert, update, delete���϶�
 * 
 * 6�ܰ� : ����� �����ͺ��̽� ����
 * 		rs.close(); //��� ����
 * 		stmt.close(); //���� �״���
 * 		pstmt.close();
 * 		con.close(); //������
 * 
 * 
 * */

import java.sql.*;

import buf.cio;

public class JDbcEx01 {

	public static void main(String[] args) {		
		Connection con = null; //������ġ?
		Statement stmt = null;
		
		try {
			//jdbc ����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection ��ü (�����ͺ��̽� ����)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			//cio.wnlf("�����ͺ��̽� ������ ���������� ����Ǿ����ϴ�.");
			
			//statement ��ü ���
			stmt = con.createStatement();
			
			//sql�� �ۼ�
			String sql = "insert into department values(203, '����������а�', 200, '7ȣ��')";
			
			//���� ����
			int result = stmt.executeUpdate(sql);
			
			cio.wnlf(result + "���� �߰� �Ǿ����ϴ�.");
			
			
			
			
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
	
// �⺻ ����
	
//	public static void main(String[] args) {		
//		Connection con = null; //������ġ?
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