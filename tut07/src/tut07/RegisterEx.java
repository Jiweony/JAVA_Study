package tut07;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {

//      Register r = new Register();
//		r.setEmail("e-mail@e-mail.com"); //필드를 private로 선언 -> 하드코딩불가
//		System.out.println(r.getEmail());
		
//		Register r = new Register("mail@mail.com", "1234", "코리아아이티");
//		System.out.println(r.getEmail());
//		
//		r.setEmail("Korea@koreait.com");
//		System.out.println(r.getEmail());
		
		//Scanner을 이용해서 배열 생성 : 3
		//입력 : Scanner 
		//for
		Scanner sc = new Scanner(System.in);
		System.out.println("가입할 회원 수 > ");
		int count = sc.nextInt();
		
		Register[] r = new Register[count];
		
		//for 입력
		for(int i = 0; i < r.length; i++) {
			System.out.println("이메일 > ");
			String email = sc.next();
			
			System.out.println("비밀번호 > ");
			String passwd = sc.next();
			
			System.out.println("이름 > ");
			String uname = sc.next();
			
			r[i] = new Register(email, passwd, uname);//생성자 초기화
			System.out.println((i+1) + "번째 회원이 등록되었습니다.");
		}
			System.out.println("회원가입이 완료 되었습니다.");
			
			System.out.println("");
			System.out.println("===="+r.length+"명의 회원출력====");
			
			for(Register reg : r) {
				System.out.println(reg.disp());
				System.out.println("===============");
			}
		
	}

}
