package list03;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

	//생성자를 통해서 List 생성, 저장 메소드, 삭제 메소드, 출력 메소드 
	
	List<Member> list = null; //공유해서 사용하는 리스트 -> 전역변수
	
	public MemberDao() {
		list = new ArrayList<Member>(); //MemberDao가 호출되면 바로 리스트를 생성해라
	}
	
	public void addMember(Member mem) {
		list.add(mem);
	}
	
	public void deleteMember(String id) {
		for(int i = 0; i < list.size(); i++) {
			String tmp = list.get(i).getUserid(); //i번째 인덱스의 userid를 가져와라
			
			if(id.equals(tmp)) {
				list.remove(i);
				System.out.println("선택하신 회원을 삭제하였습니다.");
				System.out.println();
			}
		}
	}
	
	public void showInfo() {
		for(Member m : list) {
			m.disp();
			System.out.println("--------------------");
		}
//		for(int i=0; i < list.size(); ++i) {
//			//배열명.get(i).disp();
//			list.get(i).disp();
//		}
	}
}
