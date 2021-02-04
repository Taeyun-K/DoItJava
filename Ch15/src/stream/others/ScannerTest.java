package stream.others;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Ã∏ß: ");
		String name = scanner.nextLine();
		System.out.println("job: ");
		String job = scanner.nextLine();
		System.out.println("number: ");
		String num = scanner.nextLine();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
