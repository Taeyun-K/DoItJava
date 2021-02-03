package lambda;

interface PrintString{
	void showString(String str);
}
public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);	//���ٽ��� �������̽��� ������ ����
		lambdaStr.showString("hello lamda_1");	//���ٽ� ������ ȣ��
		showMyString(lambdaStr);	//�޼��� �Ű������� ���ٽ� ������ ���� ����
		
		PrintString reStr = returnString();
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString p) {	//�Ű������� �������̽������� ����
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
