package chapter3;

public class Operator4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T':'F';
		
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2 == 0) ? true : false; //'ture','false'라고 쓰면 에러가 난다. 왜지?
		System.out.println(isEven);
		

	}

}
