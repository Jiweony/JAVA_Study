package exception;

class UseridCheckException extends Exception {

	public UseridCheckException() {
		super();
	}

	public UseridCheckException(String message) {
		super(message);
	}
	
}

//우리가 만들어 놓은 Exception을 체크하는 별도의 클래스로 동작을 만들어
class UseridCheck extends UseridCheckException {
	
	//메인에서 아이디를 전달받아서 체크
	void useridCheck(String uid) throws UseridCheckException {
		
		if(uid.isEmpty()) {
			throw new UseridCheckException("아이디를 입력하세요."); //생성자 호출
			
		}else if(uid.length() < 8) {
			throw new UseridCheckException("아이디 길이가 너무 짧습니다.");
			
		}else if(uid.length() > 12) {
			throw new UseridCheckException("아이디 길이가 너무 깁니다.");
	
		}else {
			System.out.println("("+ uid +")는 사용가능합니다.");
		}
	}
}
public class UseridCheckEx {

	public static void main(String[] args) throws UseridCheckException {
		//아이디 체크
		//1. 빈값 체크 : 아이디를 입력하세요
		//2. 길이 짧은 : 아이디가 너무 짧습니다. 8자리 이상 ~ 12이하로
		//3. 길이 긴 : 아이디가 너무 깁니다. 8자리 이상 ~ 12이하로
        //4. 정상 : 사용하셔도 됩니다.
		UseridCheck uc = new UseridCheck();
		uc.useridCheck("가나다라마바사아자차카");
		
		
	}

}
