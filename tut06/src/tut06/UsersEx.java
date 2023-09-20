package tut06;

class Users {
	//필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	//생성자 : 객체 초기화 -> public 으로 시작하고 / 클래스이름과 동일 / 리턴값 x
	public Users() {}
	
	public Users(String userid, String passwd, int age) { //오버로딩
		this.userid = userid;
		this.passwd = passwd;
		this.age = age; 
	}
	
	//캡슐화(데이터 보호) 처리 : getter(가져오기), setter(저장하기)
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}	
	
}
public class UsersEx {

	public static void main(String[] args) {
		
		//3명의 회원(Users)을 생성자로 저장 후 출력
		Users[] user = new Users[3]; //3명 -> 초기화 3번 해야함 

		for(int i = 0; i < 3; i++) {
			user[i] = new Users("아이디", "비번", 0); //초기화
			System.out.println(user[i].toString());
		}	
		
		System.out.println("============================");
		
		for(int i = 0; i < 3; i++) {
			//set 이용해서 저장 
			user[i] = new Users();
			user[i].setUserid("Busan");
			user[i].setPasswd("1234");
			user[i].setAge(10);
			
			System.out.println(user[i].toString()); //출력

		}
		
	}

}
