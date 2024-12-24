package myy.com.constructor;

public class Square {
	public Square() {
		System.out.println("i am constructor without any parameter");
	}
	public Square(int age) {
		System.out.println("age is " + age);
		
	}
	public Square(String name, int age) {
		System.out.println("name is "+name+" and age is "+ age );
	}
	public Square(int age, String name) {
		System.out.println("name is "+name+" and age is "+ age );
	}

}
