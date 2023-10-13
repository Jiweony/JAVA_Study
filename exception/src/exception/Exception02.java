package exception;

public class Exception02 {

	public static void main(String[] args) {
		
		
	}
	//Thread
	void thread1() throws InterruptedException {
		//1초 뒤에 멈추세요.
		Thread.sleep(1000);
	}
	
	void thread2() {
		
		try {
			Thread.sleep(1000);
			System.out.println("Thread 성공");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}
