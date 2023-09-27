package inher;

public class InherEx04 {

	public static void main(String[] args) {
		//생성자를 이용해서 모델, 색상을 저장 후 출력
		Phone p = new Phone("KT", "Black");
		p.turnOn();
		p.disp();
		p.turnOff();
		
		System.out.println("======================");
		//model, color, company -> 생성자로 받고 싶은 경우 
		Android ad = new Android("Z-FLIP", "IVORY", "SAMSUNG");
		ad.disp();	
		
	}

}
