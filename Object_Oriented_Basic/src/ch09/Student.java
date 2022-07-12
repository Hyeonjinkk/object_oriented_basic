package ch09;

public class Student {

	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		
		// 인스터스 생성
		korea = new Subject();
		math = new Subject();
		
	}	// end of Constructor
	
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
		
	}	// end of setKorea
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
		
	}	// end of setMath
	
	
	public void showScore() {
		
		int total = korea.score + math.score;
		
		System.out.println( studentId + "번 " + studentName + " 학생의 총점은 " + total + "점 입니다.");
		
	}
}
