package hiding.test2;

import hiding.test1.A; //A클래스 불러오기

public class Test {

	public static void main(String[] args) {

		//외부 패키지에서 사용가능(임포트하고 사용가능)
		A a = new A();
		
		//외부 패키지에서 사용불가(내부에서만 사용가능)
//		B b = new B();
		
	}

}
