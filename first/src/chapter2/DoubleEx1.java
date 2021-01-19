package chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//지수와 가수로 나타내는 부동 소수는 0를 표현하지 못하기 때문에 부동 소수점 값을 연산하면
		//약간의 오차가 발생할 수 있다.
		double dnum2=1;
		for(int i=0; i<10000; i++) {
			dnum2 = dnum2 + 0.1;
		}
		System.out.println(dnum2);
	}

}
