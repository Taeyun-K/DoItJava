package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			i = System.in.read();	//inputstream�� read �޼���� �� ����Ʈ�� �о���δ�.
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
