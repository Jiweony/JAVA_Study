package inher;

class Osystem {
	void run() { //운영체제 실행 메소드 
		System.out.println("운영체제를 시작합니다.");
	}
}

class LinuxEx extends Osystem {

	@Override
	void run() {
		System.out.println("Linux 운영체제 시작");
		
	}
	
}

class AppleEx extends Osystem {
	@Override
	void run() {
		System.out.println("Apple 운영체제 시작");
	}
}

class Microsoft extends Osystem {
	@Override
	void run() {
		System.out.println("Microsoft 운영체제 시작");
	}
}

class OsStart { //다형성**
	//부모(os)는 자식(linux, apple, ms)을 다 포함(담을)할 수 있다.
	void start(Osystem os) {
		os.run();
	}
}

public class PolyEx {

	public static void main(String[] args) {
		OsStart boot = new OsStart();
		boot.start(new LinuxEx());
		boot.start(new AppleEx());
		boot.start(new Microsoft());

	}

}
