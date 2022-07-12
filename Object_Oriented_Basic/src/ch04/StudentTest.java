package ch04;

public class StudentTest {
	//Student.java 활용 class
	
	public static void main(String[] args) {
		
		
		// 인스턴스 생성 - 학생 객체를 이용함
		var studentLee = new Student();
		
		studentLee.studentId = 12345;
		
		studentLee.setStudentName("Lee");
		
		studentLee.address = "서울 강남구";
		
		studentLee.showStuentInfo();
		
		// 두 번째 인스턴스 생성
		
		var studentKim = new Student();
		
		studentKim.studentId = 54321;
		
		studentKim.setStudentName("Kim");
		
		studentKim.address = "서울 영등포구";
		
		studentKim.showStuentInfo();
		
		
		// ch04.Student@Heap에 자리잡은 jvm 가상 address
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		
	}
}
