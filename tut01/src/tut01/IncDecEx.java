package tut01;

public class IncDecEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//임의의 정수 두 개 생성 후 증감자로 값을 초기값은 1,2 로 설정
		//1씩 증가시키거나 감소시키시오.
		int num1, num2; //변수 선언 => 메모리에 공간 설정(4byte)
		num1 = 1; //초기값 설정, ++
		num2 = 2; //--
		
		num1++;
		num2--;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("=================================");
		
		int num3, num4;
		num3 = 10;
		num4 = 5;
		
		System.out.println(num3++); //변수이름을 기준으로 연산실행 => num3을 먼저 실행하고 / 다음행에서 ++연산실행	
		System.out.println(++num3);
		
		System.out.println("=================================");
		
		//char a -> b; 문자지만 숫자로 처리 가능
		char c = 'a';
		System.out.println(c);
		
		System.out.println(++c);
		System.out.println(c++);	
		
		
		System.out.println((int)c);
		
		
	
		
	}

}
