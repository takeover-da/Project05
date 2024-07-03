package method.quiz;

public class Quiz4 {

	public static int sub(int n1, int n2) {
				
		if (n1 > n2) {
			return n1 - n2;
		} else {
			return -999;
		}
	}
	
	public static void main(String[] args) {
		int result1 = sub(20, 10);
		int result2 = sub(5, 1);
		int result3 = sub(10,20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
