package tut01;

public class PrintEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char : 문자, '', 2byte, ASCII, 숫자로 형변환 가능(타입 캐스팅)
		char c = 'k';
		System.out.println(c);
		System.out.println((int)c); //아스키 코드값을 알고 싶을 때
		System.out.println((char)107);
		
		//boolean : true, false(따옴표 사용하면 X)
		boolean b = false;
		
		//true면 통과, false면 실패 
		//if와 사용 
		//문자열의 값이같다 는 equals() 외에 같다는 ==
		
		if(b == false) 
			System.out.println("실패");
		else 
			System.out.println("성공");
		
		System.out.println("=====================================");
		
		boolean run = true;
		
		if(!run) 
			System.out.println("실패");
		else 
			System.out.println("성공");
		
		String msg = (!run) ? "성공" : "실패";
		System.out.println(msg);
		
		
	}

}
