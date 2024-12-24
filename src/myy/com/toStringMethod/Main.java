package myy.com.toStringMethod;

class Robot{
	String name;
	int age;
	public Robot(String name , int age) {
		this.name = name;
		this.age = age;
	}

	@Override 
	public String toString() {
	return "My name is "+name+ " and age is "+age;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Robot("myothuaung",20));
	}

}
