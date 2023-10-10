package custprj;

public class Customer { 
	private int id;
	private String email;
	private String name;
	private int salary;
	private String regdate;
	
	public Customer() {
		
	}

	public int getId() { // getter와 setter을 사용하여 객체에 값을 저장 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", salary=" + salary + ", regdate="
				+ regdate + "]";
	}
	
}
