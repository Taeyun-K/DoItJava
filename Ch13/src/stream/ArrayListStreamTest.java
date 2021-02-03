package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//스트림 새로 생성하여 정렬순서로 출력
		sList.stream().sorted().forEach(s->System.out.print(s+ " "));
	}
}
