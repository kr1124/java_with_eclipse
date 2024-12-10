package com.dbex;

import java.sql.*;

import buf.cio;

/* Transaction
 * 	- 여러 개의 작업을 하나의 논리적인 작업단위로 묶어주는 것을 의미함
 * 		하나의 작업 단위내의 전체 작업들이 모두 올바르게 수행되었거나,
 * 		아니면 전체 작업이 모두 수행되지 않도록 한다.(하나라도 안되면 안됨 : 직렬)
 * 
 * 	commit(), rollback()
 * 	setAutoCommit(boolean)
 * 
 * */

public class JDbcEx08 {
	public static void main(String[] args) {
		/*
		 * insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		 * 묶어서 쿼리실행시 모든 작업이 정상처리된 경우에는 commit,
		 * 하나라도 실패하면 rollback, 모든 작업을 취소 
		 * */
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();
			con.setAutoCommit(false); //auto 비활성화
			
			//---------------- transaction ----------------//
			//하나의 논리적인 작업 단위의 시작
			String sql1 = "insert into department values(?,?,?,?)";
			String sql2 = "update department set dname=?, loc=? where deptno=?";
			
			// 1번 작업
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			
			// 2번 작업
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			//정상 실행 시
			con.commit();
			cio.wnlf("데이터베이스 커밋 완료");
			
			//cio.wnlf(rs);
			
		} catch (SQLException s) {
			try {
				//rollback - 실행 실패 시
				con.rollback();
				cio.wnlf("데이터베이스 롤백");
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
