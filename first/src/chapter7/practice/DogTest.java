package chapter7.practice;
import java.util.ArrayList;

public class DogTest {
	public static void main(String[] args) {
		
		// Question 4
		Dog[] dogarr = new Dog[5];
		for(int i = 0; i < dogarr.length; ++i) {
			Dog dog = new Dog();
			dog.setName("puppy"+i);
			dog.setType("type"+i);
			dogarr[i] = dog;
		}
		for(Dog dog : dogarr) {
			System.out.println(dog.showDongInfo());
		}
		
		System.out.println("===========");
		
		// Question 5
		ArrayList<Dog> dogarr2 = new ArrayList<Dog>();
		for(int i = 0; i < 5; ++i) {
			Dog dog2 = new Dog();
			dog2.setName("doggy"+i);
			dog2.setType("siba"+i);
			dogarr2.add(dog2);
		}
		for(int i = 0; i < dogarr2.size(); ++i) {
			System.out.println(dogarr2.get(i).showDongInfo());
		}
	}
}
