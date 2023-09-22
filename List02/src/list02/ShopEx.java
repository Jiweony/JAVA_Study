package list02;

public class ShopEx {

	public static void main(String[] args) {

		//판매자로 회원가입 -> (판매자 승인) -> 상품 등록(여러 개 -List) 
		//홍길동만 쓸 수 있는 List 배열 공간을 만들어
		Seller seller = new Seller(00001, "David");
		
		seller.addItem("Samsung Laptop", 1000000, 10);
		seller.addItem("Wireless Mouse", 30000, 99);
		seller.showMemberInfo();
		
		System.out.println("-------------------------");
		
		Seller seller2 = new Seller(00002, "James");
		
		seller2.addItem("LG Laptop", 1500000, 10);
		seller2.showMemberInfo();
		
		

	}

}
