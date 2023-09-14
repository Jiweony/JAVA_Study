package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//컴퓨터는 0,1 => false(거짓) 0 
		//          => true(참) 0을 제외한 양수는 참
		
//		int i = 0;
//		double d = 0.0; 
		boolean b = false; 
		
		String str = ""; //변수의 초기값 설정
		
		//참이면 통과, 아니면 재평가
		
		//equals() : String 값
		// 그 외 같은 것을 비교할 떄는 ==
		
//		if(b) 
//			System.out.println("통과");
//		else 
//			System.out.println("재평가");

		String s = (b) ? "통과" : "재평가";
		System.out.println(s);
		
		//조건이 참이면 1 아니면 0 출력
		int i = (b) ? 1 : 0;
		//조건이 참이면 1 아니면 0 출력
		double d = (b) ? 1.0 : 0.0;
		//조건이 참이면 1 아니면 0 출력
		boolean b1 = (b) ? true : false;
		
		
	}

}
