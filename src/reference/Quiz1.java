package reference;

public class Quiz1 {

	public static void main(String[] args) {

		Book book1 = new Book("길동", 250000, "한빛출판사", 500);
		Book book2 = new Book("호이", 90000, "금빛출판사", 300);
		Book book3 = new Book("또치", 550000, "은빛출판사", 800);

		Member member = new Member(1, "둘리", book1, book2, book3);
	}

}

// 책정보 클래스
class Book {
	
	String title;		//제목
	int price;			//가격
	String bookName;	//출판사
	int bookNum;		//페이지수
	
	// 모든 책정보 변수를 초기화하는 생성자
	public Book(String title, int price, String bookName, int bookNum) {
		super();
		this.title = title;
		this.price = price;
		this.bookName = bookName;
		this.bookNum = bookNum;
	}
}

// 회원정보 클래스
class Member {
	
	int memberNum;		//회원번호
	String memberName;	//이름
	Book book1;			//대여한 책1
	Book book2;			//대여한 책2
	Book book3;			//대여한 책3
	
	// 모든 회원정보 변수를 초기화하는 생성자
	public Member(int memberNum, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
}