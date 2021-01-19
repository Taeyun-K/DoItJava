package chapter4;

public class ForExample {

	public static void main(String[] args) {
		// for문의 요소 생략
		int i = 0;
		int sum = 0;
		
		for(; i<5 ; ++i) {	//초기화식 생략
			sum += i;
		}
		for(i=0; ; i++) {	//조건식 생략
			sum += i;
			if(sum > 200) break;
		}
		for(i=0; i<5 ; ) {	//증감식 생략
			i = (++i) % 10;
		}
		for( ; ; ) {	//모든 요소 생략하고 무한 반복하는 경우에 사용
			if(i != 0) break;
		}
		System.out.println("Done!");
	}

}
