package inher;

public class Android extends Phone {
	String company;
	
	public Android() {}
	
	public Android(String model, String color, String company) {
		super(model, color); //부모의 생성자를 가져와서 사용
		this.company = company;
	}
	
	void disp() {
		System.out.println("회사명 : "+ company +", 모델 : "+ model +", 색상 : "+ color);
	}
}
