package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			//inputstreamreader은 fileinputstream이 바이트 단위로 읽어들인 내용을 문자로 변환해 주는 역할을 함.
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
