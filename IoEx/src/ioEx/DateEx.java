package ioEx;

import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		//currentMillis()
		//월(MM) - 분(mm) 
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis())); //오늘 날짜 만들기
		System.out.println(System.currentTimeMillis());
		//substring(".") -> . 을 기준으로 문자열 잘라내기
		//원본저장 :  Koreait.txt
		//사본 : System.currentTimeMillis().txt
		//용량저장 : 1~10M
		
	}

}
		   