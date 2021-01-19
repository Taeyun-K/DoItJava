package chapter3;

public class Operator3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1+10) < 10) && ((i = i + 2) < 10); //첫 항이 거짓이므로 둘째 항의 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1+10) > 10) || ((i = i+2) > 10); //첫 항이 참이므로 둘째 항 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
