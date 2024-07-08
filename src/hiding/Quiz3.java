package hiding;


public class Quiz3 {

	public static void main(String[] args) {

		MyDate3 date = new MyDate3();
		
		date.setMonth(3);
		date.setDay(25);
		
		System.out.println("현재 날짜는 " + date.getMonth() +
						   "월 " + date.getDay() + "일 입니다");
		
//		MyDate3 date = new MyDate3();
//		
//		date.setMonth(2);
//		System.out.println("현재는 " + date.getMonth() + "월 입니다");
//
//		date.setMonth(13);
//		System.out.println("현재는 " + date.getMonth() + "월 입니다");
//		
	}

}

class MyDate3 {
	
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		if (month < 1 || month > 12) {
			System.out.println(month + "는 잘못된 월 입니다.");
			return;
		}
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if (month == 2) {
			if (day < 1 || day >28) {
				System.out.println("2월에는 " + day + "일이 없습니다!!");
				return;
			}
		}
		
		this.day = day;
	}
	
	
	
}