package inher;

//이름 정하고 -> 내용은 상황에 맞게 고쳐 쓰기 
//추상화, interface
abstract class Computer {

	abstract void powerOn();
	abstract void powerOff();
	
}

class IBM extends Computer {

	@Override
	void powerOn() {
		System.out.println("IBM 컴퓨터 스타트..."); //강제로 호출
	}

	@Override
	void powerOff() {
		System.out.println("IBM 컴퓨터 종료...");
	}
	
}

public class AbsEx {

	public static void main(String[] args) {
		//인스턴스(new), 인스턴스화(객체 생성 동작)
		
	}

}
