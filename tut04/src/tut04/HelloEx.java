package tut04;

public class HelloEx {

	//매개변수는 있을 수도 있고 없을 수도 
	//public(아무나) / private(나만 : 캡슐화)
	//sysout(리턴타입 -> void), sysout(타입)
	
	/* 
	  접근제한자 리턴타입(void) 메소드명(매개변수) {
			return 변수명;
      } 
    */
	
	//유지보수
	
	public void disp(String title) {
		System.out.println(title + " Academy");
	}
	
	public void title(String str) {
		// 부산 / 서울 / 광주 
		 System.out.println(str + " 아카데미입니다.");
	}
	
	public void info(String tel, String addr) {
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + addr);
	}
	
	public static void main(String[] args) {
//		다른 메소드를 가져다 쓰려면
//		메소드가 있는 "클래스명"을 사용한다.
//		클래스 이름 = new 클래스명();
//		HelloEx he = new HelloEx();
//		매개변수에서 보낼 때는 값 -> 받을 때는 타입 변수
//		he.disp("Busan"); // 메소드를 동적으로 처리하기 위해
//		he.disp("Seoul");
		
		
		//코리아아이티 아카데미 : sysout
		//전화번호, 주소
		//코리아아이티 아카데미 : sysout
		HelloEx busan = new HelloEx();//HelloEx 클래스 안의 내용 전체를 가져 온다.
		busan.title("부산");
		busan.info("051-1234-5678", "부산광역시");
		busan.title("부산");
		
		System.out.println("===========================");
		
		HelloEx seoul = new HelloEx();
		seoul.title("서울");
		seoul.info("02-1234-5678", "서울특별시");
		seoul.title("서울");
		
		System.out.println("===========================");
		
		HelloEx gwangju = new HelloEx();
		gwangju.title("광주");
		gwangju.info("061-1234-5678", "광주광역시");
		gwangju.title("광주");
			
	}

}
