package constructor;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.publisher = "금빛컴퍼니";
		book1.pageNum = 300;
		
		Book book2 = new Book("스프링부트", 30000, "한빛컴퍼니", 200);
		
	}

}

// 클래스
class Book {
	
	String title;  //제목
	int price;		//가격
	String publisher; //출판사
	int pageNum;		//페이지수
	
	// 디폴트 생성자
	public Book() {
		super();
	}

	// 초기화하는 생성자
	public Book(String title, int price, String publisher, int pageNum) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}
	
}