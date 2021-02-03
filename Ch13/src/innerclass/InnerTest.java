package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;

	//Static Inner Class
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		void inTest() {
			//num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum= "+inNum+"(내부 클래싀의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum= "+sInNum+"(내부 클래싀의 정적 변수)");
			System.out.println("OutClass sNum= "+sNum+"(외부 클래싀의 정적 변수)");
		}
		static void sTest() {
			//num += 10 //cannot use instance variable of external class
			//inNum += 10 //cannot use instance variable of internal class
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("InStaticClass sInNum = " + sInNum);
		}
	}
	
	private InClass inClass;	//내부 클래스 자료형 변수를 먼저 선언
	
	//Constructor
	public OutClass(){	//외부 클래스가 생성된 후에 내부 클래스 생성 가능
		inClass = new InClass();
	}
	
	//Inner Class
	class InClass{
		int inNum = 100;
		//static int sInNum = 100 //인스턴스 내부 클래스에는 정적 변수를 선언할 수 없다.
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum + "(외부 클래스의 정적 변수)"
					+ "");
		}
		//static void sTest(){} //정적 메서드 정의 불가능
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		// 정적 클래스는 외부 클래스를 생성하지 않고도 내부 클래스 자료형으로 바로 선언하여 생성 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
