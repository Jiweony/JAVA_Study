package lamda;

//인터페이스 : 두 개의 문자열 매개변수
interface ConcatStr {
	void makeConcat(String s1, String s2);
}

//구현(클래스 - 생성자 가능) : 두 개의 문자열을 연결(+) - 강제 오버라이딩
class ConcatStrImpl implements ConcatStr {

	@Override
	public void makeConcat(String s1, String s2) {
		System.out.println(s1 + s2);
	}
	
}
public class LamdaEx6 {

	public static void main(String[] args) {
		//문자열 연결: + / concat(연결1, 연결2, 연결자)
		//실행 코드
		ConcatStrImpl csi = new ConcatStrImpl();
		csi.makeConcat("안녕", "하세요");
		
		System.out.println();
		
		ConcatStr cs = (str1, str2) -> {
			System.out.println(str1 +" "+ str2);
		};
		cs.makeConcat("안녕히","가세요");
	}

}
