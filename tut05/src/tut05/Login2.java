package tut05;

import java.time.LocalDate;

public class Login2 {

	//필드
	private String email;
	private String passwd;
	private LocalDate regist = LocalDate.now();
	
	//생성자
	public Login2(String str) {
		System.out.println(str);
	}

	//getter, setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public LocalDate getRegist() {
		return regist;
	}
	
	//출력 메소드
	@Override
	public String toString() {
		return "로그인 정보 [이메일 주소 : " + email + " | 비밀번호 : " + passwd + " | 로그인 시각 : " + regist + "]";
	}

	
	
	
	
	
}
