package tut06;

import java.util.Arrays;

public class ArrEx2 {

	public static void main(String[] args) {

		//값을 출력
		
		//배열에 있는 값을 확인
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		boolean[] arr2 = new boolean[] {true,false};
		
		double[]arr3 = new double[] {0.1 ,0.2, 0.3};
		
		String[] arr4 = new String[] {"red", "green", "blue"};
		
		//고정배열.length, 가변배열.size() -> 배열 길이
		System.out.println(arr4.length);
		
		//toString ->문자열로 표현
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr2));
		
		//정수는 100입니다.
		for(int i = 0; i < arr.length; i++) {
			System.out.println("정수는 "+ arr[0] +"입니다.");
		}
		
		//1, 2, 3, 4, 5
		System.out.println("향상된 for");
		
		for(int v : arr) {
			System.out.println("정수는 "+v+"입니다.");
		}
		
		System.out.println("======================");
		for(boolean b : arr2) {
			 System.out.println(b);
		}
		
		System.out.println("======================");
		for(String s : arr4) {
			 System.out.println(s);
		}
		
		
		
		
		
	}
	
}