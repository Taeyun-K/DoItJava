package chapter7.arraylist;
import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subjects> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subjects>();
	}
	
	public void addSubject(String name, int score) {
		Subjects subject = new Subjects();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subjects s: subjectList) {
			total += s.getScorePoint();
			System.out.println(studentName+"의 "+s.getName()+" 성적은 "+ 
							   s.getScorePoint() + "입니다.");
		}
		System.out.println(studentName + "의 총점은" + total+ "입니다.");
	}
}
