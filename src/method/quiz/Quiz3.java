package method.quiz;

public class Quiz3 {
	public static int comparison(int num1, int num2) {
		
		if (num1 > num2) {
			// num1이 더 큰값이다
			return num1;
			// num1을 반환한다
		} else {
			// num2이 더 큰값이다
			return num2;
			// num2을 반환한다
		}
		
	}
	
	public static void main(String[] args) {
		int result1 = comparison(10, 5);
		int result2 = comparison(2, 7);
		int result3 = comparison(5, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
