package constructor;

public class Ex3 {

}

// 게시물을 정의하는 클래스
class Board {
	int no;
	String title;
	String content;
	String writer;
	
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	public Board() {
		super();
	}

}

// 생성자 자동완성 방법!
// Alt + Shift + S -> Generate Constructor using Fields(밑에서 3번째)