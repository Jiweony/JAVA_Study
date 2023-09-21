package tut07;

public class Register {
	//필드
	private String email;
	private String passwd;
	private String uname;
	
	//생성자 : 파일이름과 동일 
	public Register() {
		
	}

	public Register(String email, String passwd, String uname) {
		this.email = email;
		this.passwd = passwd;
		this.uname = uname;
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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	//메소드
	public String disp() {
		return "이메일 : "+ getEmail() +", 비밀번호 : "+ getPasswd() +", 이름 : "+ getUname();
	}
	
	
	
	
	
	
	
	
	
}
