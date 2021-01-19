package chapter6.staticex;

public class Student {
	private static int serialNum = 1000;	//static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨.
	public int cardNum;
	public int studentID;
	public String studentName;
	public int grade;
	public String adress;
	
	public Student() {
		serialNum++;	//static변수는 모든 학생들이 공유하므로 먼저 더하고 대입해줘야 서로 다른 값을 갖게 된다.
		studentID = serialNum;
		cardNum = serialNum + 100;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	//static(클래스)메서드
	public static int getSerialNum() {
		int i =10;				//메서드 내부에서 선언한 변수이므로 사용 가능하다.
		// studentName ="이지원"	//클래스 메서드 내부에서는 인스턴스 변수를 사용할 수 없다.
		return serialNum;		//static변수이므로 클래스 메서드 내부에서도 사용이 가능하다
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
