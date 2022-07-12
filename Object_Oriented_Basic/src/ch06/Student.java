package ch06;

public class Student {

	public int studentId;
	public String studentName;
	public int grade;
	
	// 기본 생성자
	public Student() {}
	
	// 생성자 오버로딩 (overloading)
	public Student(int studentId, String studentName, int grade) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		
	} // end of Student constructor
	
	public String showStudentInfo() {
		
		return studentName + " 학생의 학번은 " + studentId + "이고, " + grade + "점입니다.";
	} // showStudentInfo
	
}
