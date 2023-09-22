package list01;

import java.util.ArrayList;
import java.util.List;

class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : "+ itemNum +" 상품명 : "+ itemName +"상품가격 :"+ itemPrice +" 상품재고 : "+ itemStock);
	}
}

class ItemDao {
		
		public List<Item> getItems() { // 리스트 타입의 메소드 생성 
			List<Item> aList = new ArrayList<Item>(); //Item 생성자의 매개변수를 담을 수 있는 ArrayList 생성
			
			aList.add(new Item(10001000L, "IBM 노트북", 2000000, 10)); //리스트의 값 입력과 동시에 생성자 초기화
			aList.add(new Item(10002000L, "게이밍 마우스", 50000, 10)); 
			aList.add(new Item(10003000L, "LG LED 모니터", 750000, 10)); 
			
			return aList; 
	}
}

public class ListEx3 {

	public static void main(String[] args) {
		//객체(Item) : 상품번호, 상품명, 가격 ,재고
		
		ItemDao dao = new ItemDao();
		List<Item> list = dao.getItems(); //getItems() 메소드 호출 
				
		System.out.println("=====for2 상품출력=====");
		for(Item item : list) { 
			item.itemDisp(); 	 
		}

		
		
//		System.out.println("등록된 상품은 "+aList.size()+"개 입니다.");
//		System.out.println("=====for1 상품출력=====");
//		for(int i = 0; i <aList.size(); i++) {
//			aList.get(i).itemDisp();;
//		}
	}

}
