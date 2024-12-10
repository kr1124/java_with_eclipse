package com.dbex;

import java.sql.*;

import buf.cio;

/*	PreparedStatement�� sql�� ���´� �����ϳ� �����̳� ���� ���� �ٸ� ������
 * ���ε� ������ ����� ���� ó�������ν� �׻� ������ sql���� ó���� �� �ִ�.
 * 
 * PreparedStatement ��ü�� ���� �� ���ε� ������ ���
 * 
 * ���ε� ���� (?)
 * 	���������� ��ü�� �κп� ����Ѵ�.
 * 
 * 	String sql = "insert into department values(?,?,?,?)";
 *  PreparedStatement pstmt = con.prepareStatement(sql);
 *  
 *  ���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� ������ �ش�.
 *  pstmt.setInt(1, 200);
 *  pstmt.setSting(2, "�������а�");
 *  pstmt.setInt(3, 300);
 *  pstmt.setSting(4, "6ȣ��");
 *  
 *  ��, ���ε� ������ �÷������� ���� ����� �� ����.
 *  
 *  PreparedStatement�� ���ε� �������� �������ִ� setXXX() �޼��带 �����Ѵ�.
 * 	
 *  
 * */

public class JDbcEx05 {
	public static void main(String[] args) {
		
//		PreparedStatement�� ����ϴ� ���
//		������ ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
//		? : �����ͺ��̽����� ���� ����ÿ� ���������� ��ü�Ǽ� �����
		
		String sql =  "insert into professor values(?,?,?,?,?,sysdate,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql);
			
			
			//���ε� ���� ����
			//������ ?(���ε� ����)�� ��ü�� �� �������� ����
			pstmt.setInt(1,  9920);
			pstmt.setString(2,  "ȫ�浿");
			pstmt.setString(3, "GilDong");
			pstmt.setString(4,  "���ӱ���");
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