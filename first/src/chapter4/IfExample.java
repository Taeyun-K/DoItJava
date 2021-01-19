package chapter4;

public class IfExample {

	public static void main(String[] args) {
		int score = 74;
		char grade = 'A';
		
		if(score <= 59) grade = 'F';
		else if(score <= 69) grade = 'D';
		else if(score <= 79) grade = 'C';
		else if(score <= 89) grade = 'B';
		else grade = 'A';
		
		System.out.println(grade);
		
	}

}
