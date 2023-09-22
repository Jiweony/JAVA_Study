package list02;

import java.util.ArrayList;
import java.util.List;

public class Seller {
//필드
	private int memberID;
	private String memberName;
	List<Item> list = null;

//생성자
	public Seller(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
		list = new ArrayList<Item>(); //상품을 등록할 수 있는 ArrayList 타입의 공간 생성 
	}
	
	public void addItem(String itemName, int itemPrice, int itemStock) {
		Item item = new Item();
		
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
	}
	
	public void showMemberInfo() {
		for(Item info : list) {
			System.out.println("판매자 아이디 : "+ memberID +"판매자 이름 : "
								+ memberName +"상품명 : "+ info.getItemName() +" 상품가격 : "
								+ info.getItemPrice() + " 상품재고 : "+ info.getItemStock());
			System.out.println("--------------------------------------------------------------");
		}
		System.out.println(list.size() + "개의 상품이 등록되어 있습니다.");
	}
}
