package chapter5;

public class Student {
	int StudentID;
	private String studentName;	//private 예약어 사용
	int grade;
	String address;
	
	Subject korean;
	Subject math;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
