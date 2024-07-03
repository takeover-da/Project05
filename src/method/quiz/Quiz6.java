package method.quiz;

public class Quiz6 {
	public static void adder(int n1, int n2, char oper) {
	
	int result = 0;
	
//	// switch문으로 작성했을때
//	switch (oper) {
//	case '+':
//		result = n1 + n2;
//		break;
//	case '-':
//		result = n1 - n2;
//		break;
//	case '*':
//		result = n1 * n2;
//		break;
//	case '/':
//		result = n1 / n2;
//		break;	
//	}
	
	// if문으로 작성했을때
	if (oper == '+') {
		result = n1 + n2;
		
	} else if (oper == '-') {
		result = n1 - n2;
		
	} else if (oper == '*') {
		result = n1 * n2;
		
	} else if (oper == '/') {
		result = n1 / n2;
	}
	
	System.out.println(n1 + " " + oper + " " + n2 + " = " + result);

	}
	
	public static void main(String[] args) {
		adder(1, 5, '+');
		adder(6, 2, '-');
		adder(2, 5, '*');
		adder(10, 2, '/');
	}
}



// 두수 => int, 연산자 => char, switch