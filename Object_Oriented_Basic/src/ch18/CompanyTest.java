package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// singleton pattern instance 호출
		var company1 = Company.getInstance();
		
		var company2 = Company.getInstance();
		
		
		// 같은 메모리 영역으로 할당된 것을 확인할 수가 있다.
		System.out.println(company1);
		System.out.println(company2);
		
		// Calendar 또한 singleton pattern인 것을 확인할 수가 있다.
		
		var calendar = Calendar.getInstance();
		
	}

}
