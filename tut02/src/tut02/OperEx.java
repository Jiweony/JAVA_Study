package tut02;

public class OperEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		String s1 = "koreait";
		String s2 = "koreait";
		
		//비교
		System.out.println(num1 > num2); //true, false
		System.out.println(num1 == num2); //String equals 
		System.out.println(s1.equals(s2)); //문자열 동등 비교(문자열 자체의 값 비교)
		System.out.println(!s1.equals(s2)); 
		
		//A=B : B를 A에 저장
		boolean b = (num1 == num2);
		
		//조건문 : if
		//프로그래밍은 중복, 불필요한 내용은 줄일려고 함
		
		if(!b)  // b == false
			System.out.println("두 수는 다릅니다.");
		else 
			System.out.println("두 수는 일치합니다.");
		
		String result = (!b) ? "두 수는 다릅니다." : "두 수는 일치합니다.";
		System.out.println(result);
		
		//숫자 입력 받아서 홀수, 짝수 구분하시오 => 숫자 % 2 == 1(홀수) / 숫자 % 2 == 0(짝수)
		
		 int num3 = 7;
		 
		 if(num3 % 2 == 0) {
			 System.out.println("짝수");
		 } else {
			 System.out.println("홀수");
		 }
		 
		 String result2 = (num3 % 2 == 0) ? "짝수" : "홀수";
		 

	}

}
