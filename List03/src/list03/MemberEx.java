package list03;

public class MemberEx {

	public static void main(String[] args) {

		//줄(dao) -> 칸(member)
		MemberDao md = new MemberDao(); //생성자 초기화
		
		md.addMember(new Member("홍길동", "1111")); //파라미터 두 개를 한 묶음으로 처리하는 객체
		md.addMember(new Member("김철수", "2222"));
		
		md.showInfo();
		
		md.deleteMember("홍길동");
		
		md.showInfo();

		
	}

}
