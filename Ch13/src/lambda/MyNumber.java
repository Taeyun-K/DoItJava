package lambda;

// �ڹٿ����� ���� ���� ���� �޼��带 ȣ���� �� �����Ƿ� �Լ��� �������̽��� �����,
// �������̽��� ���ٽ����� ������ �޼��带 �����ؾ� �Ѵ�.
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	// ���ٽ��� �͸� �Լ��̹Ƿ� �������̽��� ���� �ϳ��� �޼��常 �����Ͽ��� ��
}
