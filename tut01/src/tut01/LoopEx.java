package tut01;

public class LoopEx {

	public static void main(String[] args) {

		//0~10미만 출력하는 for
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//0~10미만 출력하는 while
		int i = 0;
		while(i < 10) {
			System.out.print(i + " ");
			++i;
		}
		
		System.out.println();
		
		//10이하 부터 1까지 출력하는 for문 작성
		for(int j = 10; j < 0; --j) {
			System.out.println(j);
		}
	}

}
