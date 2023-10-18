package thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		//숫자 출력
		Thread t1 = new Thread( () -> { //run() -> {} 의 생략
			String[] strArr = {"하나","둘","셋","넷","다섯"};	
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		//글자 출력
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int[] intArr = new int[] {1, 2, 3, 4, 5};
				
				for(int i=0; i < intArr.length; i++) {
					System.out.println(intArr[i]);
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}} );
		
		//쓰레드 우선순위 : 10 ~ 1 -> 5(지정안하면)
		System.out.println("쓰레드 이름은 :" +t1.getName());
		t1.setPriority(1);
		System.out.println(t1.getPriority());
		//t1.start();
		
		System.out.println("쓰레드 이름은 :" +t2.getName());
		t2.setPriority(10);
		System.out.println(t2.getPriority());
		//t2.start();
	}

}
