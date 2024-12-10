package com.dbex;

import java.sql.*;

import buf.cio;

public class JDbcEx02 {
//������ ����(update)
	public static void main(String[] args) {
		//�а���ȣ�� �������� �а����� ���� : ����������а� -> ��ǻ�Ͱ��а�

		//sql�� �ۼ�
		String sql = "update department set dname='��ǻ�Ͱ��а�' where deptno=203";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//jdbc ����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection ��ü (�����ͺ��̽� ����)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			//cio.wnlf("�����ͺ��̽� ������ ���������� ����Ǿ����ϴ�.");
			
			//statement ��ü ���
			stmt = con.createStatement();
			
			//���� ����
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