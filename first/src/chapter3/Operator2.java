package chapter3;

public class Operator2 {

	public static void main(String[] args) {
		
		System.out.println("증감연산자가 앞에 붙는 경우:");
		int value = 10;
		int num1 = ++value;		//증가 연산자가 value뒤에 있으면, value에 1을 더한 뒤 num에 대입한다.
		System.out.println("num1: " + num1);
		System.out.println("value: " + value);
		
		int num2 = --value;
		System.out.println("num2: " + num2);
		System.out.println("value: " + value);
		
		System.out.println("\n증감연산자가 뒤에 붙는 경우");
		int gameScore = 150;
		int lastScore1 = gameScore++;	// 증가 연산자가 gameScore뒤에 있으면, lastScore1에 gameScore를 대입한 후에 1을 더한다.
		System.out.println("num1: " + lastScore1);
		System.out.println("value: " + gameScore); //gameScore은 151이 나온다.
		
		int lastScore2 = gameScore--;
		System.out.println("num2: " + lastScore2);
		System.out.println("value: " + gameScore); //gameScore은 150이 나온다.
	}

}
