package tut01;

public class LoopEx2 {

	public static void main(String[] args) {

		//0~10까지 출력하되 짝수만 출력하시오. for 증감연산자
		for(int i = 0; i < 10; i += 2) {
			System.out.print(i);
		}
		
		//0~10미만까지 출력하되 짝수만 출력하시오. for if, break
		//변수 % 2 == 0 -> 짝수
		//해당 조건을 건너 뛸 때 -> break; continue;
		System.out.println();
		
		for(int i = 0; i < 10 ; i++){
			//break : 가장 가까운 반복문을 벗어나는 키워드
			//continue : 해당하는 반복문의 조건을 건너 뛰는 키워드	
			if(i % 2 == 0)
				continue;
		
			System.out.print(i);
		
		}
		
		System.out.println();
		
		//0~100 반복문을 작성하되, 0~20까지만 출력
		for(int i = 0; i < 100; i++) {
			if(i > 20) 
				break;
			
			System.out.print(i + " ");	
		}
			
	}

}
