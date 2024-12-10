package com.dbex;

import java.sql.*;

import buf.cio;

/* Transaction
 * 	- ���� ���� �۾��� �ϳ��� �������� �۾������� �����ִ� ���� �ǹ���
 * 		�ϳ��� �۾� �������� ��ü �۾����� ��� �ùٸ��� ����Ǿ��ų�,
 * 		�ƴϸ� ��ü �۾��� ��� ������� �ʵ��� �Ѵ�.(�ϳ��� �ȵǸ� �ȵ� : ����)
 * 
 * 	commit(), rollback()
 * 	setAutoCommit(boolean)
 * 
 * */

public class JDbcEx08 {
	public static void main(String[] args) {
		/*
		 * insert, delete, update ���� �۾����� �ϳ��� �������� �۾�������
		 * ��� ��������� ��� �۾��� ����ó���� ��쿡�� commit,
		 * �ϳ��� �����ϸ� rollback, ��� �۾��� ��� 
		 * */
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();
			con.setAutoCommit(false); //auto ��Ȱ��ȭ
			
			//---------------- transaction ----------------//
			//�ϳ��� �������� �۾� ������ ����
			String sql1 = "insert into department values(?,?,?,?)";
			String sql2 = "update department set dname=?, loc=? where deptno=?";
			
			// 1�� �۾�
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9ȣ��");
			pstmt.executeUpdate();
			
			// 2�� �۾�
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, "�������а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			//���� ���� ��
			con.commit();
			cio.wnlf("�����ͺ��̽� Ŀ�� �Ϸ�");
			
			//cio.wnlf(rs);
			
		} catch (SQLException s) {
			try {
				//rollback - ���� ���� ��
				con.rollback();
				cio.wnlf("�����ͺ��̽� �ѹ�");
			}  catch (SQLException ss) {
				ss.printStackTrace();
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