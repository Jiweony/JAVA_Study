package tut01;

public class ArithEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// /몫, % 나머지(나누어지지 않으면 값이 나머지*****)
		//임의 정수 2개를 선언, 초기화 한 후 산술연산을 수행하시오.
		//4, 5 초기값으로 설정
		
		int num1 = 4;
		int num2 = 5;
		
		//합계는 9입니다.
		
		System.out.println("합계는 " + (num1 + num2) + "입니다.");
		
		//나머지는 4입니다.
		System.out.println("나머지는 "+ (num1 % num2) + "입니다.");
		
		System.out.println("====================================");
		
		//홀수 Odd, 짝수 Even
		//객체지향언어에서 boolean 타입의 변수는 is~로 시작
		//임의의 숫자를 변수에 저장 후 나머지가 1이면 홀수 0이면 짝수를 출력하시오.
		
		int num = 7;
		
		if(num % 2 == 1) 
			System.out.println("입력하신 숫자는 홀수입니다.");
		else 
			System.out.println("입력하신 숫자는 짝수입니다.");
		
		System.out.println("====================================");
	
		
		//System.out.println(num % 2 == 1);
		
		boolean isOdd = num % 2 == 1;
		System.out.println(isOdd);
		
		if(isOdd) {
			System.out.println("홀수입니다.");
			
		}else {
			System.out.println("짝수입니다.");
		}
	
		
		System.out.println("=====================================");
		//비교연산자 > 
		// 철수와 전체 총점의 점수를 비교해서 출력하시오.
		
		int sum = 80;
		int std = 85;
		
		//System.out.println(std > sum);
		boolean isCheck = std > sum;
		
		if(isCheck)  //boolean의 default값은 true
			System.out.println("철수의 점수가 총점보다 큽니다.");
		 //무조건 else 쓰는 것 아님(굳이 안넣어도 되는 걸 넣을 필요없음)
		
		
	}

}
