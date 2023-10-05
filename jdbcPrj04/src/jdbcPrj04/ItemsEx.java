package jdbcPrj04;

import java.sql.*;

class ItemCrud {
	
	void selectItem() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String uid = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, uid, pwd);
		String sql = "SELECT * FROM items ORDER BY item_id DESC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { // DB -> 객체 -> 화면 출력
			Items item = new Items(); // Items.java 가 쿼리갯수만큼 만들어짐, 초기화
			
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));
	
			System.out.println(item.toString()); 
			
		}
	}
	
	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd); 
			
			String sql = "INSERT INTO items VALUES(NULL, ?, ?, ?, now());";
			pstmt = conn.prepareStatement(sql);
			
			Items item = new Items(); //객체 사용 for 초기화 -> 임시로 값을 객체에 저장
			item.setItemName("돼지갈비");
			item.setItemPrice(50000);
			item.setItemStock(15);
			
			pstmt.setString(1, item.getItemName()); //실제 값을 DB에 저장
			pstmt.setInt(2, item.getItemPrice());
			pstmt.setInt(3, item.getItemStock());
			int row = pstmt.executeUpdate();
			
			if(row > 0) {
				System.out.println(item.getItemName() + " 등록완료");
			}else {
				System.out.println("상품등록에 실패하였습니다.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ItemsEx {

	public static void main(String[] args) throws Exception {
		ItemCrud crud = new ItemCrud();
		//crud.insertItem();
		crud.selectItem();
	}

}
