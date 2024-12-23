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
			
			//결과 저장
			rs = pstmt.executeQuery();
			
			/* rs 객체로부터 데이터를 추출
			 * rs의 next() 메소드는 커서를 다음행으로 이동시킴
			 * 이동된 위치에 행이 존재하면 true, 없으면 false 반환
			 * rs.next()가 참인 동안, 즉, 행이 존재하는 동안 데이터를 계속 추출함
			 * 
			 * getXXX(컬럼위치), getXXX(컬럼이름)을 사용해서 컬럼값을 추출함
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
