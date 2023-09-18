package tut03;

import java.util.Scanner;

public class BalanceEx {

	public static void main(String[] args) {

		/*
		 
		System.out.println("--------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 확인 | 4. 종료");
		System.out.println("--------------------------");
		System.out.println("선택 > ");
		
		while, switch 
		Scanner로 메뉴 선택
		Scanner로 예금액, 출금액 처리
		
		종료(4) 입력 전까지는 무한반복
		예금(1) : 잔고 + 예금액
		출금(2) : 잔고 - 예금액
		확인(3) : 잔고
		종료(4) : 프로그램 종료
		 
		 */
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		while(true) {
			
		System.out.println("------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 확인 | 4. 종료");
		System.out.println("------------------------------------");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.print("얼마를 입금하시겠습니까? ");
				int input = sc.nextInt();
				money += input;
				break;
				
			case 2:
				System.out.println("얼마를 출금하시겠습니까? [현재잔액 : " + money +"원]");
				int output = sc.nextInt();
				
				if(money == 0) {
					System.out.println("현재 잔액은 0원 입니다.");
					break;
					
				} else {
					money -= output;
					break;
				}
			
			case 3:
				System.out.println("현재 잔액은 "+ money +"원 입니다.");
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못된 입력값입니다.");
				break;
				
			}
		}
		
		
	}

}
