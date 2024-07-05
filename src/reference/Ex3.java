package reference;

public class Ex3 {

	public static void main(String[] args) {

		int num = 10;
		method1(num);
		System.out.println(num);  //10, 기초타입은 영향이 없다.
		
		Subject math = new Subject("수학", 100);
		method2(math);
		System.out.println(math.scorePoint);  //50, 클래스타입은 영향이 있다.
		
	}

	// 기본형 매개변수
	public static void method1(int num) {  //기초타입
		num = 5;
	}
	
	// 참조형 매개변수
	public static void method2(Subject sub) {  //클래스타입
		sub.scorePoint = 50;
	}
	
}
