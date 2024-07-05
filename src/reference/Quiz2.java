package reference;

public class Quiz2 {

	public static void main(String[] args) {

		// 직원 3명 생성
		Employee employee1 = new Employee("고길동", 81, 500, 30);
		Employee employee2 = new Employee("둘리", 16, 300, 10);
		Employee employee3 = new Employee("희동이", 3, 100, 3);
		
		// 부서생성하고 부서원 추가
		Department department = new Department(employee1, employee2, employee3);
		
	}

}

// 직원 클래스
class Employee {
	
	String name;  //이름
	int age;	  //나이
	int pay;	  //월급
	int year;	  //근속년수
	
	// 직원 생성자
	public Employee(String name, int age, int pay, int year) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.year = year;
	}
}

// 부서 클래스
class Department {
	
	Employee Head;		//부서장
	Employee chief;		//수석연구원
	Employee senior;	//책임연구원
	
	// 부서 생성자
	public Department(Employee departmentHead, Employee chiefResearcher, Employee seniorResearcher) {
		super();
		this.Head = departmentHead;
		this.chief = chiefResearcher;
		this.senior = seniorResearcher;
	}
}