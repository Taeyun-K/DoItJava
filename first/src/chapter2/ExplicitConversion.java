package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 =1.2;
		float fNum2 =0.9F;
		
		// int iNum2 = fNum2; // 바이트 크기가 더 큰 자료형을 작은 자료형에 대입할 때 자동 형변환 일어나지 않음.
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
