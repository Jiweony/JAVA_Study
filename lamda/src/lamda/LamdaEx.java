package lamda;

//disp()
interface MyLamda { 
	void disp();
}
//람다식으로 화면 출력(sysout)
public class LamdaEx {
	public static void main(String[] args) {
		//MyLamda m = () -> {작업내용};
		//화살표 함수 뒤에 중괄호는 출력내용이 "한 줄"일 때는 생략가능 MyLamda m = () -> 작업내용
		MyLamda m = () -> {
			System.out.println("Koreait Academy");
		};
		m.disp();
		
		System.out.println("---------------------");
		
		MyLamda m2 = () -> System.out.println("코리아아이티 아카데미");
		m2.disp();
		
		System.out.println("---------------------");
		
		MyLamda m3 = () -> {
			String str = "코리아아이티 아카데미2";
			System.out.println(str);
		};
		m3.disp(); 
		
		
	}
}
