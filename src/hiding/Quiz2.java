package hiding;

public class Quiz2 {

	public static void main(String[] args) {

		Car car = new Car();
		car.setCompany("현대");
		car.setModelName("소나타");
		car.setColor("흰색");
		car.setMaxspeed(200);
		
		System.out.println("제조사: " + car.get.() +
				   			"모델명: " + get.getDay() +
							"색상: " +
				   			"최고속도: " + );
		
	}

}

class Car {
	
	private String company;//제조사
	private String modelName;//모델명
	private String Color; //색
	private int maxspeed;//최고속도
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	
}