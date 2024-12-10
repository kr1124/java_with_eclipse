package com.dbex;

import java.sql.*;

import buf.cio;

/* ResultSet
 * 
 * 	- select ������ ���� ����� ����� ��� ������ �߻�ȭ �� ����
 * 	- ��� ���տ��� �����͸� ������ �� �ִ� �پ��� �޼ҵ�� cursor�� �����ϰ� �ִ�.
 * 
 * 	first(), last(), next(), previous(), close(),
 * 	int -> getInt(index-��ġ), getInt(name-�̸�)
 * 	string -> getString(index-��ġ), getString(name-�̸�)
 * 
 * 	ResultSet ������ ����Ŭ �ڷ��� ���� �ΰ��� getXXX() �޼ҵ尡 �����Ѵ�.
 *  
 * */

public class JDbcEx04 {
	//select
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from department";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			stmt = con.createStatement();
			
			//��� ����
			rs = stmt.executeQuery(sql);
			
			/* rs ��ü�κ��� �����͸� ����
			 * rs�� next() �޼ҵ�� Ŀ���� ���������� �̵���Ŵ
			 * �̵��� ��ġ�� ���� �����ϸ� true, ������ false ��ȯ
			 * rs.next()�� ���� ����, ��, ���� �����ϴ� ���� �����͸� ��� ������
			 * 
			 * getXXX(�÷���ġ), getXXX(�÷��̸�)�� ����ؼ� �÷����� ������
			 * */
			while(rs.next()) {
				int i = rs.getInt(1);
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				cio.wnlf(i + "\t" + s1 + "\t" + j + "\t" + s2 + "\t");
			}

			//cio.wnlf(rs);
			
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