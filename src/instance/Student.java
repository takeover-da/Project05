package instance;

// 학생을 정의하는 클래스
public class Student {
	
	int studentID;  	 //학번
	String studentName;  //이름
	int grade;  		 //학년
	String address;  	 //주소
	
	public void showStudentInfo() {
		System.out.println("학번: " + studentID +
						   ", 이름: " + studentName +
						   ", 학년: " + grade +
						   ", 주소: " + address);
	}

}

// 한 줄 복사: Ctrl + Alt + ↓
// 한 줄 이동: Alt + ↓
// 현재 줄 삭제: Ctrl + D