package tut04;

public class HelloEx2 {

	public String title(String company) {
		return company + " 코리아아이티 아카데미";
	}
	
	public static void main(String[] args) {

		//코리아아이티 아카데미
		//전화번호, 주소
		//코리아아이티 아카데미
		HelloEx2 he = new HelloEx2(); //클래스 안에 메소드 가져오려면...
		System.out.println(he.title("부산"));
		System.out.println(he.title("서울"));
		System.out.println(he.title("광주"));
		
		
	}

}
