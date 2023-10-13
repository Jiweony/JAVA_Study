package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) {
//		- Exception : 컴파일
//		1. classNotFoundEx~ : Class.forName(DB); 드라이버 x 발생하는 예외
//		2. IOEx~ : 입출력
//		3. FilreNotFoundEx~ : 파일이 없는 경우
//		4. InterruptEx~ : 쓰레드
//		5. CloneNotsupportEx~ : clone객체 사용할 때
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
			
		} catch (ClassNotFoundException e) {
 			e.printStackTrace(); //예외가 발생한 부분 표시 : 개발자
 			e.getMessage(); //에외 메시지
 			System.out.println("404 Error : 관리자에게 문의하세요.");
 			
		} finally { //성공, 실패 여부 상관 x 마지막에 꼭 실행해야 하는 내용
			System.out.println("프로그램 종료.");
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("404 error: 관리자에게 문의하세요.");
			
		} catch (IOException e) {
			System.out.println("파일에 데이터를 읽어올 수 없습니다.");
			
		} finally {
			System.out.println("종료합니다.");
		}
		
		/*
		 ` -Runtime Exception : 실행 단위
		 	- ArithmeticEx : 나누기 예외
		 	- ArrayIndexOutBoundEx~ 
		 	- NullPointEx~
		 */
		
		
		String str = "koreait";
		//글자 추출 후 char로 변경해서 출력
		System.out.println(str.charAt(0));
		
		String str2 = null;
		
		try {
			System.out.println(str2.charAt(0));

		} catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("데이터 값이 없습니다.");
		}
		
	}

}
