package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		var employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		
		
		var employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
		
	}
	
}