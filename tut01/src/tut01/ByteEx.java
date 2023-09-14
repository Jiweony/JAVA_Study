/*
  1. 프로그램명 : byte타입 예제
  2. 작성일 : 2023. 09. 08
  3. 작성자 : 홍길동
  4. 내용 : -128 ~ 0, + 127까지 출력해 보기
*/


package tut01;

public class ByteEx {

	public static void main(String[] args) {

		//-128 저장 -> byte
		//데이터타입 변수명 = 값;
		//왼쪽 = 오른쪽; 오른쪽 값을 왼쪽에 대입
		
		//byte b = 128; // byte 범위 초과(-128 ~ 127)
		int b = 128;
	    System.out.println(b);
	}

}
