package list02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	List<Member> list = null; 
	
	public MemberDao() { //생성자
		list = new ArrayList<>(); //실행시킬 때 바로 리스트배열 생성
	}
	public void addMember(Member m) {
		list.add(m);
	}
	
	public void showMember() { //상세보기
		for(Member mem : list) {
			System.out.println(mem);
			System.out.println("====================");
		}
	}
	
	public void deleteMember(int id) {
		//저장자료 -> memberID == id -> 배열.remove(배열번호)
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getMemberID() == id) { //찾고자 하는 아이디와 i번째 멤버아이디가 일치하면  
				list.remove(i); //i번째 멤버아이디를 삭제해라
				System.out.println(id + "회원번호를 삭제하였습니다.");
			}
		}
		System.out.println();
	}
	
	public void findById(int searchID) {
		for(int i = 0; i < list.size(); i++) {
			int tmpID = list.get(i).getMemberID(); //멤버아이디를 가져와서 tmpID에 넣어라
			
			if(tmpID == searchID) {
				Member m = list.get(i);
				
				System.out.println("===================");
				System.out.println("검색된 회원을 출력합니다.");
				System.out.println("회원아이디 : "+ m.getMemberID() +"회원이름 : "+ m.getMemberName());
				System.out.println("===================");

			}
		}
	}
}
