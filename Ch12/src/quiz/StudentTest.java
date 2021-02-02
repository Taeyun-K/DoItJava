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
		set.add(new Student("100", "�̼���"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�����"));
		set.add(new Student("400", "�Ż��Ӵ�"));
		set.add(new Student("100", "ȫ�浿"));
		
		System.out.println(set);
	}

}
