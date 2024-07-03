package method.quiz;

public class Quiz2 {

	public static int max(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
//		모든 경우에 return을 해야함		
	}
	public static void main(String[] args) {
		int result1 = max(10,5);
		int result2 = max(2,7);
		int result3 = max(5,5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	}
	