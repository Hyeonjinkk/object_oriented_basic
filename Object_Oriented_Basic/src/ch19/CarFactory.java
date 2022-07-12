package ch19;

public class CarFactory {
	private static int serialNum = 10000;
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			
			instance = new CarFactory();
			
		} // end of if
		
		
		return instance;
	} // end of getInstance
	
	// createCar
	public Car createCar() {
		
		var car = new Car();
		car.setCarNum(++serialNum);
		return car;
	}
	
}
