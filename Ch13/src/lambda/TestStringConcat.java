package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		//클래스에서 인터페이스 구현하기
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1,  s2);
		
		//람다식으로 구현하기
		StringConcat concat2 = (s,v) -> System.out.println(s + "," + v);
		concat2.makeString(s1,s2);
	}

}
