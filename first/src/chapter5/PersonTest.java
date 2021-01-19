package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 40;
		p1.name = "James";
		p1.married = true;
		
		System.out.println(p1.age+"\n"+p1.name+"\n"+p1.married);
	}

}
