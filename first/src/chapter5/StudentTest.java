package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();	//자바에서는 grabage collector가 자동으로 메모리 해제
		student1.setStudentName("김태연");
		System.out.println(student1.getStudentName());
		
		System.out.println(student1);	//힙 메모리에 생성된 인스턴스의 메모리 주소는 참조 변수에 저장.(클래스이름@주소) 
	}

}
