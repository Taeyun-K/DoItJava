package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		//Ŭ�������� �������̽� �����ϱ�
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1,  s2);
		
		//���ٽ����� �����ϱ�
		StringConcat concat2 = (s,v) -> System.out.println(s + "," + v);
		concat2.makeString(s1,s2);
	}

}
