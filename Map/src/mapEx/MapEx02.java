package mapEx;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Board {
	private int id;
	private String subject;
	private String writer;
	private LocalDate regdate = LocalDate.now();
	
	public Board() {
		
	}

	public Board(int id, String subject, String writer) {
		this.id = id;
		this.subject = subject;
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getRegdate() {
		return regdate;
	}	
	
	public void disp() {
		System.out.println("번호 : "+ id +" 제목 : "+ subject +" 작성자 : "+ writer +" 작성일 : "+ regdate);
	}
	
}
public class MapEx02 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("p1", new Board(101, "게시물 테스트입니다.", "홍길동")); //생성자 초기화
		map.put("p2", new Board(102, "공지사항 테스트입니다.", "김철수"));
		map.put("p3", new Board(103, "Q&A 테스트입니다.", "이영희"));

		map.forEach((k, v) -> {
			Board board = (Board)map.get(k);
			//board.disp();
			//번호
			System.out.println(board.getId());
			});
	
}
}
