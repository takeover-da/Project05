package hiding;

public class Ex2 {
	public static void main(String[] args) {

		MyDate2 date = new MyDate2();
		date.setMonth(2);
		date.setDay(30);
	
		System.out.println("현재 날짜는 " + date.getMonth() +
						   "월 " + date.getDay() + "일 입니다");
	
		
		date.setDay(10);
		System.out.println("현재 날짜는 " + date.getMonth() +
				"월 " + date.getDay() + "일 입니다");

	}

}

class MyDate2 {
	
	private int month;	//월
	private int day;	//일
	
	// 월을 가져오는 메소드(조회)
	public int getMonth() {  //리턴ㅇ, 매개변수x
		return month;
	}
	
	// 월을 변경하는 메소드(수정)
	public void setMonth(int month) {  //리턴x, 매개변수ㅇ
		this.month = month;
	}
	
	// 일을 가져오는 메소드(조회)
	public int getDay() {  //리턴ㅇ, 매개변수x
		return day;
	}
	
	// 일을 변경하는 메소드(수정)
	public void setDay(int day) {  //리턴x, 매개변수ㅇ
		
		// 새로들어온 값이 올바른 일자인지 확인하고 저장
		// 2월인 경우, 일자가 1보다 작거나 28보다 크다면 저장안함
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("2월에는 " + day + "일이 없습니다!!");
				return; //반환x, 함수종료o
				
			}
		}
		
		
		this.day = day;
	}
	
}