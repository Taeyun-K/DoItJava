package chapter6.singleton;

// Singleton 패턴 구현하기
// 프로그램 전체에서 인스턴스를 단 한 번 사용하는 경우에 사용하는 클래스 생성 패턴.
// 1. 생성자를 private으로 만들기. 외부에서 다른 인스턴스를 또 생성할 수 없게끔 생성자를 private으로 만든다.
// 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기.
// 3. 외부에서 참조할 수 있는 public 메서드 만들기. private으로 선언한 유일한 인스턴스를 외부에서도 사용할 수 있도록 설정해야.
//    반드시 static으로 선언해야 한다. 인스턴스 생성여부에 관계없이 사용할 수 있어야 하기 때문에
public class Company {
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
