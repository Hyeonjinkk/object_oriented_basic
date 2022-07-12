package ch11;

public class TestReport {

	public static void main(String[] args) {

		var builder = new MakeReport();
		
		String report = builder.getReport();
		
		System.out.println(report);
		
	}

}
