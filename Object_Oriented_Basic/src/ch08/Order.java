package ch08;

public class Order {

	// 멤버 변수
	public Long OrderId;
	public int buyerPhoneNum;
	public String buyerAddress;
	public int OrderDate;
	public int OrderTime;
	public int OrderPrice;
	public String menuId;
	
	public Order(Long OrderId, int buyerPhoneNum, String buyerAddress, int OrderDate, int OrderTime, int OrderPrice, String menuId) {
		this.OrderId = OrderId;
		this.buyerPhoneNum = buyerPhoneNum;
		this.buyerAddress = buyerAddress;
		this.OrderDate = OrderDate;
		this.OrderTime = OrderTime;
		this.OrderPrice = OrderPrice;
		this.menuId = menuId;
	}
	
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + OrderId);
		System.out.println("주문 핸드폰 번호 : " + buyerPhoneNum);
		System.out.println("주문 집 주소 : " + buyerAddress);
		System.out.println("주문 날짜 : " + OrderDate);
		System.out.println("주문 시간 : " + OrderTime);
		System.out.println("주문 가격 : " + OrderPrice);
		System.out.println("메뉴 번호 : " + menuId);
	}
	
	
}
