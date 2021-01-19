package chapter6.thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;	// 생성된 인스턴스 자신을 가리키는 역할
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay인스턴스의 주소 출력
		bDay.printThis();			// 윗줄과 같은것 출력.
	}
}

