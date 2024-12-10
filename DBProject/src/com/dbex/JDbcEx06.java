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
			
			//���ε� ���� ����
			//������ ?(���ε� ����)�� ��ü�� �� �������� ����
			pstmt.setInt(1,  500);
			pstmt.setString(2,  "ȫ�浿");
			
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