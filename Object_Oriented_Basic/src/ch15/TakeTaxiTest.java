package ch15;

public class TakeTaxiTest {
	public static void main(String[] args) {
		// person Edward
		var personE = new Person("Edward", 20000);
		
		// taxi 잘나간다 운수
		var taxi = new Taxi("잘나간다 운수");
		
		// method 설정
		personE.takeTaxi(taxi, 10000);
		
		personE.showPersonInfo();
		taxi.showTaxiInfo();

	}

}
