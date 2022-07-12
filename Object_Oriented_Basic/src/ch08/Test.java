package ch08;

public class Test {
	
	public static void main(String[] args) {
		
		// 1. Person.java
		var tomasInfo = new Person(180, 78, 37, "Tomas");
		
		tomasInfo.showPersonInfo();
		
		
		// 2. Order.java
		
		var orderInfo = new Order(202011020003L, 01023450001, "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, "0003");
		
		orderInfo.showOrderInfo();
		
	}

}
