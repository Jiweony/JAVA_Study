package setEx01;

import java.util.Set;
import java.util.HashSet;

public class SetEx01 {

	public static void main(String[] args) {
		//HashSet 정수 저장
		//HashSet 문자열 저장
		//삭제, 출력
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		//값을 배열 형태로 출력
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("--------------------");
		
		HashSet<String> hs = new HashSet<>();
		hs.add("서울");
		hs.add("서울");
		hs.add("부산");
		System.out.println(hs.toString()); //중복된 값 허용 x
		System.out.println(hs.size());
		
		//hs.remove(0);
		hs.remove("seoul");
		
		for(String str : hs) {
			System.out.println(str);
		}
		
		//hs.contains(검색어)
		Set<String> set2 = new HashSet<>();
		set2.add("Red");
		set2.add("Green");
		set2.add("Blue");
		
		System.out.println(set2.contains("Black")); //boolean 타입 - > true / false
		
		set2.remove("Green");
		System.out.println(set2.size());
		
	}

}
