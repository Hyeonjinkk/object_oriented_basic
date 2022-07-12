package ch09;

public class SubjectTest {
	
	public static void main(String[] args) {
		
		var studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 99);
		
		
		//
		
		var studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 65);
		
		//
		
		studentLee.showScore();
		studentKim.showScore();
		
	}

}
