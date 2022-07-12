package ch14;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}	// end of constructor
	
	public void take(int money)
	{
		
		this.money += money;
		passengerCount++;
		
	}	// end of take

	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}	// end of showSubwayInfo
	
}