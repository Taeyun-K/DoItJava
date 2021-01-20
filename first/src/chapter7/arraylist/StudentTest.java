package chapter7.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 89);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 95);
		studentKim.addSubject("수학", 96);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===========================");
		studentKim.showStudentInfo();
	}

}
