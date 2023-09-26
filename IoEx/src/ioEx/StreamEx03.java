package ioEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		// k o r e a i t -> 1바이트씩 출력  더 이상 읽을 자료가 없으면 -1을 만남
		String filename = "C:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename); //파일 내용을 읽어올 준비를 마침
		
		// .read(); 1byte씩 읽음
		int result = 0;
		while((result = is.read()) != -1) {
			System.out.print(result + ">");
			System.out.println((char)result);
		}
		/*while(true) {
			int result = is.read(); //글자를 byte로 읽어오지만 정수로 처리
			if(result == -1) //더 이상 출력할 글자가 없으면 -1 return
				break; //제일 가까운 반복문 벗어남
			
			System.out.print((char)result);
			System.out.println("남은 byte(s)는 "+is.available()+"입니다.");
		}*/
		is.close();
	}

}
