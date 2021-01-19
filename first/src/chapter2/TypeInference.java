package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// 자료형 비명시 변수선언 주의할 점
		// 1. 한 번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없다.
		// 2. var로 자료형 없이 변수를 선언하는 방법은 지역변수만 가능하다.
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 3;
	}

}
