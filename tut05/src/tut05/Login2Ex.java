package tut05;

public class Login2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login2 log2 = new Login2("로그인 정보를 출력합니다...");
		
		log2.setEmail("이메일 주소");
		log2.setPasswd("비밀번호");
		
		System.out.println("========== 출력 ==========");
		System.out.println(log2.getEmail());
		System.out.println(log2.getPasswd());
		System.out.println(log2.getRegist());
		System.out.println("===== 로그인 정보 출력 =====");
		System.out.println(log2.toString());
	}

}
