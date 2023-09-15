package tut01;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int money = 10000;
		int coffee = 3000;
		int stock = 10;
		
		while(flag) {
		System.out.println("====================");
		System.out.println("스타벅스 커피 자동 판매기");
		System.out.println("====================");
		System.out.println("1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)");
		System.out.print("메뉴선택 > ");
		String choice = sc.next();
		
			switch(choice) {
			
			case "P":
			case "p":
			{
			
				System.out.print("커피를 몇 잔 구매하시겠습니까? ");
				int num = sc.nextInt();
				
				money -= (coffee * num);
				stock -= num;
				
			if(money > 0) {
					
				if(stock < 0) {
					
					System.out.println("재고부족");
					break;
					
				} else if(money >= coffee) {
					
					System.out.println("> 커피 "+ num +"잔을 구매하였습니다.");	
					System.out.println(">> 남은 커피의 재고는 "+ stock +"잔입니다.");
					System.out.println("");
					break;
					
				   }
				
				} else { //처음 구매할 때, 보유한 잔액보다 많이 구매할 경우
					
					System.out.println("잔액부족"); 
					money = 10000; 
					stock = 10; // 다시 초기화 
					break;
				}

			} 	
			
			case "B":
			case "b":
			{
				System.out.println(">> 현재 남은 잔액은 "+ money +"입니다.");
				System.out.println("");
				break;
			}
				
			case "Q":
			case "q":
			{
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
				
			default:
				System.out.println("잘못된 입력입니다! 다시 입력해주세요.");
				continue;
				
			}
		}
		
	
		
		

		
	}

}
