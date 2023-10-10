package custprj;

import java.util.List;

public class CustomerEx {

	public static void main(String[] args) throws Exception {
		CustomerDao dao = new CustomerDao();
		dao.setCustomer();
		
		//dao.getCustomers(); //3줄
		List<Customer> list = dao.getCustomers();
		
		if(list.isEmpty()) {
			System.out.println("등록된 고객이 없습니다.");
		} else {
			for(Customer c : list) {
				System.out.println(c.toString());
			}
		}
	}

}
