package tut02;

public class ScopeEx {

	public static void main(String[] args) {

		//1~10 까지 더해서 총합을 출력하시오.(한 번)
		//누적되는 값을 처리하려면 반복문 밖에 변수 선언(전역) / static 메소드 사용
		//변수 값은 바로 위 중괄호 영역에서만 값을 사용
		//단, for()문은 오른쪽 {}안에서만 값을 사용가능
		
		int i= 0;
		while(i < 10) {
			
			System.out.println(i);
			++i;
		}
		System.out.println(i);
		
	}

}
