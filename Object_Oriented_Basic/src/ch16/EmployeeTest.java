package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// private 하게
		System.out.println("기준 사번은 " + Employee.getSerialNum() + "입니다.\n" + "==================================");
		
		var employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		
		var employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
		
	}
	
}
