package chapter5.practice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// Constructor
	public MyDate(int a, int b, int c) {
		day = a;
		month = b;
		year = c;
	}
	
	// Methods
	public String isValid() {
		if(month<1 || month>12) return "유효하지 않은 날짜입니다.";
		else if(month == 2) {
			if(day<1 || day > 28) return "유효하지 않은 날짜입니다.";
			else return "유효한 날짜입니다.";
		}
		else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			if(day<1 || day>31) return "유효하지 않은 날짜입니다.";
			else return "유효한 날짜입니다.";
		}
		else {
			if(day<1 || day>30) return "유효하지 않은 날짜입니다.";
			else return "유효한 날짜입니다.";
		}
	}
	
}
