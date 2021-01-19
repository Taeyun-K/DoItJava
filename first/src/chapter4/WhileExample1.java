package chapter4;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num;
			++num;
		}
		System.out.println(sum);
		
		// while문의 무한한 반복. while문은 조건문이 참이면 실행됨을 활용한다.
		while(true) {
			if(num==19) break;
			num++;
		}
		System.out.println(num);
	}

}
