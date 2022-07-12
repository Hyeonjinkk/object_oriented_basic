package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// 기본 생성자 활용
		
		var studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		// 생성자를 활용
		
		var StudentKim = new Student(123456, "KIM", 3);
		
		System.out.println(StudentKim.showStudentInfo());
		

	} // end of main
	
} // end of class
