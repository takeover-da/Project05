package method.quiz;

public class Quiz7 {
	
	// 각 자리수의 합을 구하는 메소드 선언
	public static void add(int num) {
		int sum = 0;  //합계
		
		// 1의 자리
		sum = sum + (num % 10);
		
		// 10의 자리
		num = num / 10;
		sum = sum  + (num % 10);
		
		// 100의 자리
		num  = num / 10;
		sum = sum + num;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args ) {
		add(932);
	}

}


// 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요
// 예시) 932 => 9 + 3 + 2 = 14


// 1나누기
// 10나누기
// 100나누기