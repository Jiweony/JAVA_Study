package test;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("A(a).입력 | Q(q).종료");
			System.out.print("선택 > ");
			char c = sc.next().charAt(0);
			
			if(c == 'a' || c == 'A') {
			
				System.out.print("영어입력(띄어쓰기 없이) > ");
				String s = sc.next();
				System.out.println();
				String res = s.toUpperCase();
				System.out.print("대문자로 바꾼 결과 > " + res);
				System.out.println();
			
			} else if(c == 'q' || c == 'Q'){
				System.out.println("프로그램 종료");
				System.exit(0);
			} else {
				System.out.println("잘못된 메뉴 선택입니다.");
				System.out.println();
			}
		}	
		
	}
}
