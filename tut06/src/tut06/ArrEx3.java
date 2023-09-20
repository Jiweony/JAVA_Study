package tut06;

public class ArrEx3 {

	public static void main(String[] args) { // 실행파일

		//메소드를 이용해서 출력
		//정수에 5개 점수를 입력 후
		//합계
		//평균
		
		//int[] scores = new int[] {1,2,3,4,5};
		int[] scores = null;
		scores = new int[] {1, 2, 3, 4, 5};
		
		Cal c = new Cal(); //클래스에 있는 메소드를 사용하기 위한 객체 생성
		Display d = new Display();
		
		//보낼 때는 값(오른쪽), 받을 때는 타입(왼쪽)으로	
		//보낼 때 new
		//System.out.println(c.sum(scores));
		
		//배열 10개의 합은 100입니다.
		System.out.println("배열 "+ scores.length +"개의 합은 "+ c.sum(scores) +"입니다.");
		
		//평균구하기
		//평균은 88.00입니다.
		d.title("컴퓨터 프로그램");
		System.out.printf("평균은 %.2f입니다.", c.avg(scores));
		System.out.println("");
		System.out.println(d.close("시스템 종료"));
		
	}

}
