package inher;

public class InherEx03 {

	public static void main(String[] args) {
		//interface, abstract -> 객체 생성해서 사용 x(new x)
		// 본체({} x)
		
		Student s = new Student();
		s.eat();
		s.study();
		s.stdID = "A 200 100 001";
		s.name = "홍길동";
		s.age = 18;
		s.eat();
		s.sleep();
		
		Emp e = new Emp();
		e.eat();
		e.work();
		e.empID = "100 500 001";
		e.name = "Steven";
		e.age = 27;
		e.eat();
		e.sleep();
	}

}
