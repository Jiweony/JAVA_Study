package tut01;

public class StringEx {

	public static void main(String[] args) {

		//기본타입 Koreait 문자열 저장
		//겍체타입 Koreait 문자열 저장
		//비교하는 예제
		
		String str = "Koreait";
		String str2 = new String("Koreait");
		
		//비교 A.equals(B) => 값
		if(str.equals(str2)) {
			System.out.println("저장 위치는 다르지만 값은 동일합니다.");
		}
		
		//문자열 비교 == => 메모리 주소값
		//비교연산자(>, <, == => 결과값 true, false출력)***** -> 문자열에서만 사용
		
		//System.out.println(str == str2);
		boolean result = str == str2;
		if(result)
			System.out.println("메모리가 동일합니다.");
		else
			System.out.println("메모리 위치가 다릅니다.");
		
		
		//**문자열을 제외하면 비교는 == 사용하면 됨
		int num1 =1;
		int num2 =2;
		
		boolean res = (num1 == num2);
		
		
	}

}
