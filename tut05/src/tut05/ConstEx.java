package tut05;

class Const {
	//default 생성자는 생략가능 그 외에는 생성자를 만들어줘야 함
	/*
	public Const() {}
	
	
	public Const(String str) {
		System.out.println(str);
	}
	
	public Const(String str, String domain) {
		System.out.println(str + " , " + domain);
	}*/
	
	
	
	public Const(String str) { //생성자
		System.out.println(str);
	}
	
	public Const(String str, String tel) { //오버로딩
		System.out.println(str); // this(str);
		System.out.println(tel);
	}
	
	public Const(String str, String tel, String addr) { //오버로딩
		System.out.println(str); // this(str, tel);
		System.out.println(tel); 
		System.out.println(addr);
	}
	
	public int add(int num1, int num2) { //정수 메소드
		return num1 + num2;
	}
	
	public String close(String str) { //종료 메소드
		return str;
	}
}
public class ConstEx {

	public static void main(String[] args) {
		
		Const cal = new Const("코리아아이티 계산기 Ver1.0"); //생성자 출력
		System.out.println(cal.add(100,200));
		System.out.println(cal.close("프로그램 종료"));
		
		System.out.println("============================");
		
		//코리아아이티, 전화번호 추가
		Const seoul = new Const("코리아아이티 계산기 Ver1.0", "051-123-4567");
		
		//코리아아이티, 전화번호, 주소 추가
		Const gwangju = new Const("코리아아이티 계산기 Ver1.0", "051-123-4567", "광주");
		
		
		
		
		/*
		//초기값 : 코리아아이티 출력 -> 작업 (제일 처음 시작할 때 먼저 실행하고 프로그램을 진행하기를 원할 때)
		Const c2 = new Const("코리아아이티");
		
		//초기값 : 코리아아이티, 도메인 출력 -> 작업
		Const c3 = new Const("코리아아이티" , "Koreait.com");  
		*/
		
		//코리아아이티 계산기 Ver1.0 - 생성자
		//정수 + 정수 = 정수 메소드
		//프로그램 종료 - 메소드 
	}

}
