package tut06; //계산하는 파일

public class Cal { 

	// 합계 메소드 : 동작
		public int sum(int[] scores) {
			
			int sum = 0;
			for(int i = 0; i < scores.length; i++) {
				sum += scores[i];
			}
			return sum;
		}
		
		// 평균 메소드 : 동작
		public double avg(int[] scores){
			
			int sum = 0;
			for(int i = 0; i < scores.length; i++) {
				sum += scores[i];
			}
			return (double) sum / scores.length;
		}
}
