package list02;

public class Member {
//회원번호, 회원명 : 기본키(절대 중복 x) 
//삭제, 검색 
//ERD : primary key - Foreign key
	//필드
	private int memberID;
	private String memberName;
	//생성자 
	public Member() {}

	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	//getter, setter
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//메소드
	@Override
	public String toString() {
		return "[회원아이디 : " + memberID + ", 회원이름 : " + memberName + "]";
	}
	
	
	
	
}
