package mapEx;

import java.util.Map;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {

		//Map - HashMap
		//101 -> 서울
		//102 -> 부산
		//103 -> 대구 //키는 중복 허용 x, 값은 중복 가능
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
		//배열명.forEach((키 별명, 값 별명) -> {출력코드});
		map.forEach((k, v) -> {System.out.println("키는 "+ k +" 값은 "+ v);});
		
		System.out.println("----------");
		
//		userid -> 홍길동 
//		userid -> 김철수
//		userid -> 이영희
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("user01", "홍길동");
		map2.put("user02", "김철수");
		map2.put("user03", "이영희");
		
		//map2.put("user03", "코리아"); 키값 중복 불가
		
		map2.forEach((k ,v) -> {System.out.println("키는 "+ k + " 값은 "+ v);});
		
		System.out.println(map2.containsValue("김철수"));
		System.out.println(map2.containsKey("user01")); 
		
		
		
		//System.out.println(map.toString());
	}

}
