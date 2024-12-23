package com.dbex;

import java.sql.*;

import buf.cio;

/* ResultSet
 * 
 * 	- select 쿼리의 수행 결과로 얻어진 결과 집합을 추상화 한 것임
 * 	- 결과 집합에서 데이터를 가져올 수 있는 다양한 메소드와 cursor를 포함하고 있다.
 * 
 * 	first(), last(), next(), previous(), close(),
 * 	int -> getInt(index-위치), getInt(name-이름)
 * 	string -> getString(index-위치), getString(name-이름)
 * 
 * 	ResultSet 내에는 오라클 자료형 마다 두개의 getXXX() 메소드가 존재한다.
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
			
			//결과 저장
			rs = stmt.executeQuery(sql);
			
			/* rs 객체로부터 데이터를 추출
			 * rs의 next() 메소드는 커서를 다음행으로 이동시킴
			 * 이동된 위치에 행이 존재하면 true, 없으면 false 반환
			 * rs.next()가 참인 동안, 즉, 행이 존재하는 동안 데이터를 계속 추출함
			 * 
			 * getXXX(컬럼위치), getXXX(컬럼이름)을 사용해서 컬럼값을 추출함
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
