package tut01;

public class ConOpt {

	public static void main(String[] args) {

		//삼항연산자
		//정수 두 개를 비교하여 크면 1, 작으면 0으로 출력하시오.
		 
		int num1 = 3;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0;
		System.out.println(result); //방법1
		
		//임의의 정수를 생성 후 1이면 홀수, 0이면 짝수를 출력하시오.
		
		int num3 = 5;
		
		String s = (num3 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(s); //방법2
		
		String msg = "";
		if(num3 % 2 == 1) {
			msg = "홀수";
		} else {
			msg = "짝수";
		}
		System.out.println(msg); //방법3
		
	}

}
