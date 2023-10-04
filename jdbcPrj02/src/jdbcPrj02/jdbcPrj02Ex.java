package jdbcPrj02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class jdbcPrj02Ex {

	public static void main(String[] args) {
		jdbcPrj02Ex jdbc = new jdbcPrj02Ex();
		jdbc.insertDB();
	}
	
	public void insertDB() {
		try {
			//데이터베이스 연결 성공...
			//1. Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결객체 
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String passwd = "1234";
			
			//정상적으로 연결 된다면 Connection 객체 받아주기
			Connection conn = DriverManager.getConnection(url, id, passwd);
			//conn : 데이터베이스에 연결되었으니까...
			System.out.println("접속성공");
			String sql = "INSERT INTO register VALUES(102, '이영희', '5678');";
			
			// 위 변수에 저장된 쿼리를 실행하는 createStatement() 객체 사용
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입 완료");
			
			
			//3. createStatement("INSERT INTO...")
			//4. execute
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패...");
		}
	}

}
