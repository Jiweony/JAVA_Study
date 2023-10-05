package jdbcPrj04;

import java.sql.*;

class InsertDao{
	
	void selectDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd); 
			
			String sql = "SELECT * FROM items ORDER BY item_id DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("상품번호 : " + rs.getInt(1)); //첫 번째 요소의 값을 가져옴 
				System.out.println("상품이름 : " + rs.getString(2));
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd); 
			
			String sql = "INSERT INTO items VALUES(null, ?, ?, ?, now());";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "한우++"); //첫 번째 물음표에 값을 넣음
			pstmt.setInt(2, 1000000); //두 번째 물음표에 값을 넣음
			pstmt.setInt(3, 10); //세 번째 물음표에 값을 넣음
			
			int row = pstmt.executeUpdate();//executeUpdate() -> 성공하면 1 실패하면 0 반환 
			if(row > 0) { 
				System.out.println(row);
				System.out.println("상품등록완료");
			} else {
				System.out.println(row);
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class JDBCPrj04 {

	public static void main(String[] args) {
		InsertDao dao = new InsertDao();
		//dao.insertDB();
		dao.selectDB();
	}

}
