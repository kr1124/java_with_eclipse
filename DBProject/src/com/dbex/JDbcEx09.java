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
			con.setAutoCommit(false); //auto 비활성화
			
			pro.load(new FileInputStream("src/department.properties"));
			pstmt = con.prepareStatement(pro.getProperty("department_insert")); //property 가져와서 sql문 대입

			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			int i = pstmt.executeUpdate();
			
			//정상 실행 시
			con.commit();
			cio.wnlf("데이터베이스 커밋 완료");
			cio.wnlf(i + "개의 행이 추가되었습니다.");
			
			//cio.wnlf(rs);
			
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException s) {
			try {
				//rollback - 실행 실패 시
				con.rollback();
				cio.wnlf("데이터베이스 롤백");
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
