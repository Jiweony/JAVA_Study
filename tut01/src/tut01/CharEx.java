package tut01;

public class CharEx {

	public static void main(String[] args) {

		char c = 'a';
		String str = "b";
		int ch = 'a'; // ASCII 코드 값 출력(A = 65 ~)
		
		System.out.println(c);
		System.out.println(str);
		System.out.println((char)(ch + 1));
		
		System.out.println("---------------------");
		
		//회원가입 했을 떄 저장된 아이디, 비밀번호
		String userid = "koreait";
		String passwd = "12345";
		
		//내가 지금 입력한 아이디, 비밀번호
		String userid2 = "seoul";
		String passwd2 = "67890";
		
		//값이 같냐 다르냐 -> A.equals("B") A와 B의 값이 같으면 
		//확인 => if -> 맞으면 로그인되었습니다. 다시 로그인 해주세요.
		if(!userid.equals(userid2)) { //userid와 userid2가 같지 않으면
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("가입된 회원이 아닙니다.\n회원가입 해주세요.");
		}
		
		System.out.println("---------------------");
	
		
	}

}
