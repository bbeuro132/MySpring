package com.Lee.org3.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

//@Service
//@Repository 위의 두개를 써도 되지만, 평균적인 상황에서는 component가 자주 쓰임
@Component
public class DBManager {
	
	public void insertTest(String para1, String para2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//이 클래스 파일이 없으면 catch 구믄으로 진행
			//있을 시 다음줄을 진행한다
			//ip : 전화번호
			//port : 내선번호
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mh", "root", "1234");
			pstmt = conn.prepareStatement("insert into test values(?,?)");
			pstmt.setString(1, para1);
			pstmt.setString(2, para2);
			pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteTest(String para1) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mh", "root", "1234");
			pstmt = conn.prepareStatement("delete from test where para1=?");
			pstmt.setString(1, para1);
			pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateTestPara1(String para1, String para2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mh", "root", "1234");
			pstmt = conn.prepareStatement("update test set para1=? where para1=?");
			pstmt.setString(1, para1);
			pstmt.setString(2, para2);
			pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
