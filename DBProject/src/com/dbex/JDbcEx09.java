package com.dbex;

import java.util.*;
import java.sql.*;
import java.io.*;

import buf.cio;

/* 
 * 
 * */

public class JDbcEx09 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		Properties pro = new Properties();
		
		try {
			con = ConnUtil.getConnection();
			con.setAutoCommit(false); //auto ��Ȱ��ȭ
			
			pro.load(new FileInputStream("src/department.properties"));
			pstmt = con.prepareStatement(pro.getProperty("department_insert")); //property �����ͼ� sql�� ����

			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");
			int i = pstmt.executeUpdate();
			
			//���� ���� ��
			con.commit();
			cio.wnlf("�����ͺ��̽� Ŀ�� �Ϸ�");
			cio.wnlf(i + "���� ���� �߰��Ǿ����ϴ�.");
			
			//cio.wnlf(rs);
			
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException s) {
			try {
				//rollback - ���� ���� ��
				con.rollback();
				cio.wnlf("�����ͺ��̽� �ѹ�");
			}  catch (SQLException ss) {
				s.printStackTrace();
			}
		} finally {
//			try {
//				if(rs != null) {
//					rs.close();
//				}
//			} catch (SQLException se) {}
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