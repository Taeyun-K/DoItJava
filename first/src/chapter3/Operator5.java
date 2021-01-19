package chapter3;

public class Operator5 {

	public static void main(String[] args) {
		int num1 = 5;	//0B 0000 0101
		int num2 = 10;	//0B 0000 1010
		
		System.out.println(num1&num2);	//0B 0000 0000
		System.out.println(num1|num2);	//0B 0000 1111
		System.out.println(num1^num2);	//0B 0000 1111
		System.out.println(~num2);		//0B 1111 0101
		
		int num = 0B00000101;	// 십진수 5를 8비트 이진수로
		
		System.out.println(num<<2);	//왼쪽으로 2비트 이동(20)
		System.out.println(num>>2);	//오른쪽으로 2비트 이동(1)
		System.out.println(num>>>2);	//오른쪽으로 2비트 이동, 앞에 무조건 0채워넣음
		
		num = num<<2;	//왼쪽으로 2비트 이동한 값을 다시 num에 대입
		System.out.println(num);

	}

}
