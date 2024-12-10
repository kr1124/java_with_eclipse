package com.dbex;

import java.sql.*;

import buf.cio;

public class JDbcEx07 {
	//select
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ConnUtil.getConnection();

			String sql = "select f.name, f.profno, f.position, d.dname, d.deptno "
					+ "from professor f, department d where f.deptno=d.deptno "
					+ "and f.deptno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 203);
			
			//��� ����
			rs = pstmt.executeQuery();
			
			/* rs ��ü�κ��� �����͸� ����
			 * rs�� next() �޼ҵ�� Ŀ���� ���������� �̵���Ŵ
			 * �̵��� ��ġ�� ���� �����ϸ� true, ������ false ��ȯ
			 * rs.next()�� ���� ����, ��, ���� �����ϴ� ���� �����͸� ��� ������
			 * 
			 * getXXX(�÷���ġ), getXXX(�÷��̸�)�� ����ؼ� �÷����� ������
			 * */
			while(rs.next()) {
				String s1 = rs.getString(1);
				int i = rs.getInt(2);
				String s2 = rs.getString(3);
				String s3 = rs.getString(4);
				int j = rs.getInt(5);
				cio.wnlf(s1 + "\t" + i + "\t" + s2 + "\t" + s3 + "\t" + j + "\t");
			}

			//cio.wnlf(rs);
			
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException se) {}
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