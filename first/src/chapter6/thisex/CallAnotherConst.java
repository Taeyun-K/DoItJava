package chapter6.thisex;

class Person{
	//member variables
	String name;
	int age;
	
	//Constructor
	Person(){
		//this.name = "noname";	//this를 사용한 생성자 이전에 다른 코드 넣을 수 없음. 
								//constructor call must be the first statement in a constructor.
		this("이름 없음", 1);	//this를 사용해 Person생성자 호출
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//method
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
