package chapter6.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());	//인스턴스 생성 없이 호출 가능

		Student s1 = new Student();
		s1.setStudentName("김도연");
		System.out.println(s1.getSerialNum());
		System.out.println(s1.studentName+", "+s1.studentID+", 카드번호:"+s1.cardNum);
		
		Student s2 = new Student();
		s2.setStudentName("손수건");
		System.out.println(s2.getSerialNum());		//serialNum 변수를 인스턴스 이름으로 참조
		System.out.println(Student.getSerialNum());	//메서드를 직접 클래스 이름으로 불러옴
		System.out.println(s2.studentName+", "+s2.studentID+", 카드번호:"+s2.cardNum);
	}

}
