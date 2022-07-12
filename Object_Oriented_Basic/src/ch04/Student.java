package ch04;

public class Student {
	// 멤버변수
	public int studentId;
	public String studentName;
	public String address;
	
	
	public void showStuentInfo() {
		System.out.println( studentId + " 학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}	// end of showStudentInfo
	
	public String getStudentName() {
		return studentName;
	}	// end of getStudentName
	
	public void setStudentName(String name) {
		studentName = name;
	}	// end of setStudentName

}
