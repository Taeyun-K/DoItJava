package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	//Variable
	private static final long serialVersionUID = -1503252402544036183L;	//클래스 버전 관리를 위한 시리얼 아이디 명시
	String name;
	transient String job;	//직렬화하고 싶지 않은 변수 지정 transient 예약어
	
	//Constructor
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	//Method
	public String toString() {
		return name + ", " + job;
	}
}


public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
