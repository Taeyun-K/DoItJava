package chapter9.finalex;

public class UsingDefine {

	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);	//static으로 선언했으므로 인스턴스 생성 없이 클래스 이름으로 참조 가능
		System.out.println("최솟값: " + Define.MIN);
		System.out.println("최댓값: " + Define.MAX);
		System.out.println("수학 과목의 코드는 " + Define.MATH);
		System.out.println("영어 과목의 코드는 " + Define.ENG);
	}

}
