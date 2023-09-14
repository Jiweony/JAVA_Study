package tut01;

public class IntEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int age = 20;
		System.out.println(age);
		
		//출력이 한 줄일 경우에만 => 중괄호 삭제가능
		if(age >= 20) 
			System.out.println("성인");
		else 
			System.out.println("미성년");

		//삼항 연산자
		//조건 ? "참일 떄" : "거짓일 떄"
//		String result = (age >= 20) ? "성년" : "미성년";
//		System.out.println(result);
		
		
	}

}
