package test;

public class test01 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 1000 ; i++) {		
			sum1 += i;	
		}
		
		for(int j = 0; j < 1000 ; j++) {		
			if((j % 3 == 0) || (j % 5 == 0)) {
				sum2 += j;
			}
		}	 
		
		System.out.println(sum1 - sum2);
	}

}
