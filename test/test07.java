package test;

import java.sql.*;

class DatabBase{
	
	void insertDB() throws SQLException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/kordb";
			String uid = "kordb";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			String sql = "insert into kordb_member values(null, '허심청', '1111', '2023-10-01', 'F', '자기소개 3')";
			
			pstmt = conn.prepareStatement(sql);
			int row = pstmt.executeUpdate();
			
			if(row == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	void selectDB() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/kordb";
			String uid = "kordb";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			String sql = "select * from kordb_member";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("번호 : " + rs.getInt(1) + 
								   ", 이름 : " + rs.getString(2) +
								   ", 비밀번호 : " + rs.getString(3) + 
								   ", 등록날짜 : " + rs.getString(4) + 
								   ", 성별 : " + rs.getString(5) + 
								   ", 자기소개 : " + rs.getString(6));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
public class test07 {

	public static void main(String[] args) throws SQLException {
		Database db = new Database();
		db.selectDB();
		
	}

}

