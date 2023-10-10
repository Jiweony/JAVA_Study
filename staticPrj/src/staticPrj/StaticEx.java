package staticPrj;

class Member{
	int price = 10000;
	static double tax = 0.1;
	
	void method() {
		System.out.println("인스턴스(new) 메소드");
	}
	
	static void staticMethod() {
		System.out.println("static 메소드");
	}
}
public class StaticEx {

	public static void main(String[] args) {
		//인스턴스
		Member m = new Member();
		System.out.println(m.price);
		
		//인스턴스 x, static -> new(인스턴스화) 할 수 있지만 -> 클래스명.메소드명(); 으로 사용
		System.out.println(Member.tax);
		
		System.out.println("--------------");
		
		m.method();
		Member.staticMethod();
	}
}
