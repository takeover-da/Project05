package instance;

public class Ex3 {

	public static void main(String[] args) {

		Car car = new Car();  // 객체 생성
		car.setStatus(true);  // 현재상태 변경
		car.showStatus(); 	  // 현재상태 출력
		
	}

}

// 자동차를 정의하는 클래스
class Car {  // 클래스로 만든 "Car"를 자료형으로 쓰고 있음.
	
	boolean status;  // 현재상태(속성(boolean))
	
	// 현재 상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) {  // 밖에서 안에 있는 선언구를 사용할때 set을 사용
		status = stt;
	}
	
	// 현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
}