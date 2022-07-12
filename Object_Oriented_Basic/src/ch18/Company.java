package ch18;

public class Company {

	
	private static Company instance = new Company();
	
	// Singleton pattern
	private Company() {}
	
	
	// 외부에서 Company 생성할 수 있게 하기 위한 method
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}	// end of for
		
		
		return instance;
	}
	
	
}
