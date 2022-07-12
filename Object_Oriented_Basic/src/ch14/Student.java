package ch14;

public class Student {
	// 멤버 변수 설정
	String studentName;
	int money;
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;
		this.money = money;
	} // end of Constructor
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}	// end of bus
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}	// end of subway
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
	
}
