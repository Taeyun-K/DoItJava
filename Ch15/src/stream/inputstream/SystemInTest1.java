package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();	//inputstream의 read 메서드는 한 바이트만 읽어들인다.
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
