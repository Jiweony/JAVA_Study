package tut01;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수 5와 8의 합을 출력하시오
		//변수, 선언, 초기화 = 선언과 초기화를 동시에
		
//		int num1, num2; // 선언
//		num1 = 5; //초기화
//		num2 = 8;
		
		//변수 이름 첫글자는 소문자
		int num1 = 5;
		int num2 = 8;
		
		//결과값을 변수에 저장 후 출력
		
		int result = num1 + num2;
		
		System.out.println(result);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//byte(1) -> int(4) -> float(4) -> double(8)
		//0, 1 => 1byte = 8bit => 2 * 8 => 256 / 2 = 128
		//byte = 음수(-128), 0 , 양수(127)
		//byte : 메시지 전송, 이미지 처리
		byte b = -128;
		
		System.out.println("============================");
		
		//int 10억 넘어가면 ~
		//long 
		//int money = 10000000000;
		long money = 10000000000L;
		
		//float 
		//PI는 겂이 정해져 있는(고정되어 있는) 값 - 상수 => 대문자로 표현
		float PI = 3.12345678F;
		System.out.println(PI);
		
		//16진수 
		//0 ~ 15 : 0~9, a, b, c, d, e, f
		
		

	}

}
