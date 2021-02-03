package lambda;

public class TestCalc {

	public static void main(String[] args) {
		Calc calc = (x, y) -> {return x+y;};
		System.out.println(calc.add(35, 24));
	}

}
