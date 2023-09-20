package tut06;

public class ArrEx {

	public static void main(String[] args) {

		//배열 + 반복문(for - 배열번호가 필요할 때, 향상된 for값만 출력)
		//배열번호는(index)는 0번부터 시작
		//i, idx, index 변수이름 -> 배열을 처리하기 위한 용도
		
		//정수 100개를 저장하는 프로그램을 완성하시오.
		//데이터타입 변수명 = new 데이터타입;
		int[] value = new int[100];	//4byte * 100개의 빈 공간이 생성 
		value[0] = 100; //초기화
		value[1] = 200;
		value[2] = 300; 
		
		//배열 0~2번까지 출력하시오
		//배열명[인덱스]
		//for
		
		//value[0]의 값은 0입니다. 
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
		for(int i = 0; i < 3; ++i) {
			//System.out.println("value["+ i +"]의 값은 "+ value[i] +"입니다.");
			System.out.println(""+ (i + 1) +"번 값은"+ value[i] +"입니다.");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		//int[] num = {1, 2, 3, 4, 5};
		//초기값을 설정하면 배열 갯수가 생성
		//학생 3명 점수를 초기값으로 설정 후 
		//화면에 출력하시오
		//합계를 출력하시오
		//평균을 출력하시오
		
		int[] jumsu = {88, 77, 66, 55, 44};
		
		//등록된 게시물 수는 1000개입니다.
		System.out.println("등록된 학생 수는"+ jumsu.length +"명 입니다."); 
		
		System.out.println("=====화면출력=====");
		for(int i = 0; i < 3; ++i) {
			System.out.println(jumsu[i] + "");
		}
		
		System.out.println("=====합계 출력=====");
		//합계 : 누적(전역, static)
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) +"번 점수는 "+ jumsu[i] +"입니다.");
			sum = sum + jumsu[i];
		}
		System.out.println("합계는 "+ sum +"입니다.");
		
		System.out.println((double)sum / jumsu.length);
		
		double result = (double)sum / jumsu.length;
		
		//출력 포맷 변경 소수점 2자리로 설정
		//평균은 87.55입니다. 
		System.out.println(String.format("평균은 %.2f입니다. ", result));
		System.out.printf("평균은 %.2f입니다. ", result);
		//생성자 : 초기화
		//Member m = new Member();
		
		
		
		
//		for(int i = 0; i < 배열명.length; i++) {
//			출력코드(배열명[i]);
//		}
//		
//		for(출력타입 : 배열명) {
//			출력코드(별명);
//		}
	} 

}
