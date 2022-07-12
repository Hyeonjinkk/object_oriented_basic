package ch14;

public class TakeTransTest {
	
	public static void main(String[] args) {
		// James 버스
		var studentJ = new Student("James", 5000);
		
		var bus100 = new Bus(100);
		var bus500= new Bus(500);
		
		studentJ.takeBus(bus100);
		
		// Tomas 지하철
		var studentT = new Student("Tomas", 10000);
		
		var greenSubway = new Subway(2);
		
		studentT.takeSubway(greenSubway);
		
		//
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showSubwayInfo();
		
		
	}
}
