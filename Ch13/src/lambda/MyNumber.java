package lambda;

// 자바에서는 참조 변수 없이 메서드를 호출할 수 없으므로 함수형 인터페이스를 만들고,
// 인터페이스에 람다식으로 구현할 메서드를 선언해야 한다.
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	// 람다식은 익명 함수이므로 인터페이스에 오직 하나의 메서드만 선언하여야 함
}
