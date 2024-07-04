package instance.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.name = "James";
		person.age = 40;
		person.maritalStatus = 'o';
		person.childNum = 3;
		
		person.showPerson();
		
	}
}

class Person {
	
	String name;		 // 이름
	int age;  			 // 나이
	char maritalStatus;  // 결혼 여부
	int childNum;  		 // 자식 수
		
	public void showPerson() {
		System.out.println("이름: " + name +
				   		   ", 나이: " + age +
				   		   ", 결혼 여부: " + maritalStatus +
				   		   ", 자식 수: " + childNum);
	}
}