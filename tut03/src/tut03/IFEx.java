package tut03;

public class IFEx {

	public static void main(String[] args) {

		//임의의 점수(정수) 생성 : 0 ~ 100
		//점수가 90보다 크고 100점 보다는 작다. 학점은 A학점이다.
		//80보다 크면 B학점
		
		int num; // 변수를 선언 -> 메모리 생성 -> 값 x -> 초기화
		num = 88; // 초기화 
		
		if(num >= 90) {
			System.out.println("100점 보다는 작습니다.");
			System.out.println("A학점입니다.");
		}else {
			System.out.println("100점 보다는 작습니다. ");
			System.out.println("학점은 B학점입니다.");
		}
		
		
	}

}
