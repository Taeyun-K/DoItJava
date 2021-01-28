package chapter11.object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate mdt = (MyDate)obj;
			if((this.day == mdt.day) && (this.month == mdt.month) && (this.year == mdt.year) )
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return(this.year*10000 + this.month*100 + this.day);
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(28, 1, 2021);
		MyDate date2 = new MyDate(28, 1, 2021);
		System.out.println(date1.equals(date2));
		
		System.out.println("date1의 hashCode :" + date1.hashCode());
		System.out.println("date2의 hashCode :" + date2.hashCode());
		
		System.out.println("date1의 실제 주소값 :"+System.identityHashCode(date1));
		System.out.println("date2의 실제 주소값 :"+System.identityHashCode(date2));
	
	}
}
