package instance.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		Order order = new Order()
				
		
	}

}

class Order {
	
	int orderNum;		 // 주문번호
	String orderDate;  	 // 주문날짜
	String ordererName;  // 주문자 이름
	int deliveryAddress; // 배송지

	public void setOrder(boolean) {
		
	}
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNum +
		   		   ", 주문날짜: " + orderDate +
		   		   ", 주문자 이름: " + ordererName +
		   		   ", 배송지: " + deliveryAddress);
	}
}

//다음과 같이 주문클래스(Order)를 정의하세요.
//주문번호, 주문날짜, 주문자이름, 배송지를 속성으로 갖습니다.
//모든 주문 정보를 출력하는 showOrderInfo 함수를 갖습니다.
//
//그리고 Order 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
//주문번호: 1111
//주문날짜: 2018년3월12일
//주문자이름: 둘리
//배송지: 서울시 영등포구 여의도동 20번지