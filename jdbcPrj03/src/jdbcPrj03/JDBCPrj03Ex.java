package jdbcPrj03;

import java.sql.*;

//동작을 별도 클래스 작업 
class DBDao {
	void insertDB() throws Exception { //i/o
		/*
		 	1.연결 - Connection 객체
		 	2.쿼리실행 - Statement, PreparedStatement
		   (3.결과출력 - ResultSet)
		 */
		Connection conn = null;
		Statement stmt = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://127.0.0.1:3306/grp";
		String uid = "root";
		String pwd = "1234";
		
		//접속정보
		conn = DriverManager.getConnection(url, uid, pwd); //연결 객체에 정보 저장 
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전 작업
		
		//쿼리실행
		String query = "insert into member values(NULL, 'Steven', now(), now());";
		stmt.execute(query);
		System.out.println("Insert Completed...");		
		
	}
}

public class JDBCPrj03Ex {

	public static void main(String[] args) throws Exception {
		DBDao db = new DBDao();
		db.insertDB();
	}

}
