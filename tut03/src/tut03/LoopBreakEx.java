package tut03;

public class LoopBreakEx {

	public static void main(String[] args) {

		//break;
		//0 ~ 10까지 출력하시오.
		//단, 조건 7까지만 출력하시오.
		for(int i = 0; i < 10; ++i) {
			if(i == 7)
				break; //가장 가까운 반복문을 빠져나감
			
			System.out.println(i);
		}
		
		System.out.println("======================");
		//1 ~ 20까지 홀수만 출력하시오
		for(int i = 1; i < 20; ++i) {
			
			if(i % 2 == 0)
				continue; // 건너뛰시오
			
			System.out.println(i);
		}
	}

}
