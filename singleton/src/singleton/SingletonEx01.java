package singleton;

class SingletonTest {
	private static SingletonTest st = new SingletonTest();
	public SingletonTest() {}
	
	public static SingletonTest getInstance() { //instance = 연결 
		return st;
	}
}

public class SingletonEx01 {

	public static void main(String[] args) {
		SingletonTest st1 = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println(st1 == st2);
	}

}
