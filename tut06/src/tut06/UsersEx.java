package tut06;

class Users {
	//필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	//생성자 : 객체 초기화 -> public 으로 시작하고 / 클래스이름과 동일 / 리턴값 x
	public Users() {}
	
	public Users(String userid) {
		this.userid = userid;
	}
	
	public Users(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	public Users(String userid, String passwd, int age) { //오버로딩
		this.userid = userid;
		this.passwd = passwd;
		this.age = age; 
	}
	
	//getter, setter

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	
	
	
}
public class UsersEx {

	public static void main(String[] args) {
		//회원가입 1명을 처리하시오.
		//생성자를 이용해서 저장
		//getter, setter 
		
		Users[] user = new Users[3]; //회원 한명 저장(아이디, 비밀번호, 나이 한꺼번에 저장) \ '객체'로 선언한 배열 => 타입이 다른 필드 3개를 하나로 묶어서 처리
		for(int i = 0; i < user.length; ++i) {
			user[i] = new Users();
			/*user[i] = new Users("아이디");
			  user[i] = new Users("아이디", "비번");
			  user[i] = new Users("아이디", "비번", 10);*/
		}
		
		//생성자를 이용해서 초기화(값 입력)
		user[0] = new Users("아이디1", "비번1", 10);
		user[1] = new Users("아이디2", "비번2", 20);
		user[2] = new Users("아이디3", "비번3", 30);

		System.out.println(user[0].toString());
		System.out.println(user[1].toString());
		System.out.println(user[2].toString());


		
		
	}

}
