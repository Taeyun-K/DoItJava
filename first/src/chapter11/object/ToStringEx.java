package chapter11.object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {	//toString을 재정의해서 인스턴스 정보가 아닌 원하는 값이 출력되도록
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());	
		
	}
}
