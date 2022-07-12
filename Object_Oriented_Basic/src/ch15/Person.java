package ch15;

public class Person {
	// 멤버 변수 설정
	String name;
	int money;
	
	public Person(String name, int money)
	{
		
		this.name = name;
		this.money = money;
		
	}	// end of constructor
	
	public void takeTaxi(Taxi taxi, int money)
	{
		
		taxi.take(money);
		this.money -= money;
		
		
	}	// end of takeTaxi
	
	public void showPersonInfo() 
	{
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}	// end of showPersonInfo
	
}
