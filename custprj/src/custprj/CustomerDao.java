package custprj;

import java.sql.*;
import java.util.*;     

public class CustomerDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	CustomerDao dao = null;
	
	//연결 객체
	Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//입력
	void setCustomer() throws Exception {
		PreparedStatement pstmt = null;
		
		dao = new CustomerDao();
		dao.getConnection(); //디비 연결 완료

		String sql = "INSERT INTO customers VALUES(?,?,?,?, now());";
		pstmt = dao.getConnection().prepareStatement(sql);
		//db에 저장하기 전에 setter에 임시 저장
		Customer c = new Customer(); 
		c.setId(102);
		c.setEmail("mail@mail.com");
		c.setName("홍길동");
		c.setSalary(100000000);
		
		pstmt.setInt(1, c.getId());
		pstmt.setString(2, c.getEmail());
		pstmt.setString(3, c.getName());
		pstmt.setInt(4, c.getSalary());
		
		int row = pstmt.executeUpdate();
		if(row > 0) {
			System.out.println("고객 등록 완료");
		} else  {
			System.out.println("실패");
		}
 
	}
	
	//출력
	List<Customer> getCustomers() throws Exception {
		//Collections 이용
		//빈줄, 빈칸 -> 값 삽입 -> 객체.add();
		List<Customer> list = new ArrayList<>();
		
		dao = new CustomerDao();
		dao.getConnection(); //디비 연결 완료
		
		String sql = "SELECT * FROM customers ORDER BY id DESC";
		pstmt =  conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			Customer cu = new Customer();
			
			cu.setId(rs.getInt(1));
			cu.setEmail(rs.getString(2));
			cu.setName(rs.getString(3));
			cu.setSalary(rs.getInt(4));
			cu.setRegdate(rs.getString(5));
			
			list.add(cu); //list 3줄
		}
		return list;
	}
}
