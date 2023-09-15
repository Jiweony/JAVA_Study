package tut02;

public class OperEx2 {

	public static void main(String[] args) {

		int std1 = 80;
		int std2 = 70;
		int avg = 75;
		//AND이고, 이면서
		//OR 이거나, 또는
		//학생1 점수가 평균 점수보다 높고 학생2 점수가 평균보다 높으면 통과 아니면 재평가
		
		if(std1 >= avg && std2 >= avg) {
			System.out.println("통과");
		}else {
			System.out.println("제평가");
		}
		
		System.out.println("==========================");
		/* 학생 점수가 90이상 100이하면 최우수
		학생 점수가 80이상 89이하이면 우수
		나머지는 보통으로 출력 */
		int jumsu = 88;
		
		if(jumsu >= 90 && jumsu <= 100) 
			System.out.println("최우수");
		else if(jumsu >= 80 && jumsu <=89) 
			System.out.println("우수");
		else 
			System.out.println("보통");
		
		System.out.println("");
		
		//가입한 회원정보의 이메일과 비밀번호를 비교하여 
		//모두 일치하면 로그인 되었습니다.
		//일치하지 않으면 로그인 정복가 일치하지 않습니다. 로 표시
		//가입된 정보는 db 이메일, 비번
		//로그인 할 떄 입력하는 이메일, 비번
		
		String db_id = "koreait";
		String db_passwd = "1234";
		
		String id = "koreait";
		String passwd = "1234";
		
		boolean id_check  = db_id.equals(id);
		boolean pwd_check = db_passwd.equals(passwd);
		
		if(id_check && pwd_check) {
			System.out.println("로그인 되었습니다.");
			
		}else {
			System.out.println("로그인 정보가 틀립니다. \n로그인 페이지로 이동합니다.");	
		}
		
		System.out.println("==========================");
		
		System.out.println(true && true); //모두 같아야 참
		System.out.println(true && false); 
		System.out.println(true || false); //하나만 참이면 참
		System.out.println(true || true);
		
		boolean res = true && false;
		System.out.println(res);
		
		if(res == true) {
			System.out.println("위 결과는 참입니다.");
		}
	}

}
