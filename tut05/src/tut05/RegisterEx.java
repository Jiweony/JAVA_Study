package tut05;

class Register{
	//필드 : 캡슐화
	private String userid; // private : Register 클래스 안에서만 사용가능 -> main에서 직접적으로 값 조정 불가 -> public 접근제한자를 가진 생성자를 통해서 값을 조정
	private String passwd;
	private int point;
	
	//생성자
	public Register(String userid, String passwd, int point) {
		//필드 = 파라미터;
		this.userid = userid; // 파라미터로 들어온 userid(public)의 값을 필드의 userid(private)에 저장 => 같은 클래스이므로 접근가능
		this.passwd = passwd;
		this.point = point;
	}
	
	public Register() {
		
	}
	
	public void disp() {
		System.out.println("아이디 : " + this.userid + " / 비밀번호 : " + this.passwd + " / 포인트 : " + this.point); // 값이 저장되어있는 필드(private)
	}
	
	//메소드
}

public class RegisterEx {

	public static void main(String[] args) {

		//회원가입 프로그램 : 객체 = 회원 1명 정보
		//아이디(String), 비번(String), 포인트(int)를 저장하고 출력하는 프로그램
		Register p1 = new Register("korea", "1234", 1000); // 생성자의 파라미터에 값을 보냄
		p1.disp(); 
		
	}

}
