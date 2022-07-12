package ch14;

public class Bus {
	// 멤버 변수 설정
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	} // end of constructor
	
	public void take(int money)
	{
		this.money += money;
		
		passengerCount++;
		
	}	// end of take
	
	public void showBusInfo() {
		
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
		
	} // end of showBusInfo
}
