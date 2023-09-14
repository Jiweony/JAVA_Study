package tut01;

public class DoubleEx {

	public static void main(String[] args) {

	
//		double d = 1.0;
//		double d2 = 2.0;
		 
		double d, d2;
		d  = 1.23456;
		d2 = 2.23456;
		
		//쇼핑몰 -> 1.2 + 2.2 = 3.4 => 3
		//실수 -> 정수로 타입 변환 : 형변환 = (바꿀 타입)변수명
		
		//순수한 숫자를 제외하면 +연산자는 앞뒤를 연결할 떄 사용
		System.out.println("합계" + (int)(d + d2) + "달러"); 
		//연산자 우선순위 특별히 지정하지 않으면 가까운 쪽에 것을 먼저 처리 => () : 처리 우선순위가 가장 높음
		
//		0012345-1234567 주민번호의 8번쨰 숫자를 이용하여 남자 여자를 표시하여라
//		단, &와 if를 사용해서 표시하여라

		//1이면 남자, 2이면 여자로 표시
		int jumin = 2;
		
		if(jumin % 2 == 1) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		String result = (jumin % 2 == 1) ? "남자" : "여자"; 
		System.out.println(result);
		
		
		
		
	}

}
