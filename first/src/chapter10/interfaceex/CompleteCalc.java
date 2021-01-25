package chapter10.interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) 
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	//마우스 우클릭 - Source - Override... - description()
	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
