package ioEx;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {

		//파일 존재하는지 확인 후 
		//파일을 생성하였습니다 / 파일이 존재합니다 검사 -> exists() - boolean
		//io -> open -> close
		
		try {
			String filename = "C:\\temp\\koreait.txt";
			File file = new File(filename); //파일 만들 준비
			
			if(!file.exists()) {
				//만드는
				boolean result = file.createNewFile();
				if(result)
					System.out.println("파일이 생성되었습니다.");
				else
					System.out.println("파일이 이미 존재합니다.");
			}
			System.out.println(file.getAbsolutePath());
			
			//작업(이클립스) 위치 출력
			System.out.println(System.getProperty("user.dir"));
			
		}catch(Exception e) { //최상위 예외 -> Exception
			//e.printStackTrace();
			System.out.println("파일 생성에 오류가 있습니다.");
		}
		
	}

}
