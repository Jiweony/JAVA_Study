package tut05;

public class CalEx {
	//오버로딩
	//매개변수 다르거나 타입을 다르게 사용할 때는 같은 이름을 써도 사용
	public int add(int num1, int num2) {
		// int sum = num1 + num2;
		return num1 + num2; 
	}
	
	public double add(double num1, double num2) {
		
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public boolean isPrint(int num1, int num2) {
		 
		
		return (num1 + num2) > 200 ? true : false;
	}

	
	
	
	public static void main(String[] args) {
		//재사용 : 반복사용
		//코리아이티 계산기 : void, String
		//두 개의 정수를 더하기 하는 메소드 -> 100 + 200 = 300
		//프로그램 종료
		
		//보내줄 때(메인에서 메소드로) 값, 처리할 때는 타입 변수
		//배열은 보내줄 때는 생성자, 처리할 때는 타입[] 변수
		CalEx ce = new CalEx();
		System.out.println(ce.add(100,200));
		
		//100,200,300 = 600
		System.out.println(ce.add(100,200,300));
		
		//100 + 100의 결과가 200보다 크면 true를 출력하시오 
		System.out.println(ce.isPrint(100,100));
	
		//정수를 이용하여 홀수면 true, 짝수면 false 출력
		Cal c = new Cal();
		
		System.out.println(c.isCheck(5));
		
	}
}
