package quiz;

import java.util.HashSet;

class Student{
	private int studentId;
	private String studentName;
	
	//Constructor
	public Student(String id, String name) {
		studentId = Integer.valueOf(id);
		studentName = name;
	}
	
	//Method
	@Override
	public String toString() {
		return (this.studentId + " "+ this.studentName);
	}
	

	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "이순신"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "정약용"));
		set.add(new Student("400", "신사임당"));
		set.add(new Student("100", "홍길동"));
		
		System.out.println(set);
	}

}
