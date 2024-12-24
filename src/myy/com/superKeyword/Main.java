package myy.com.superKeyword;
class AA{
	
}
class Robot extends AA{
	String color = "blue";
	public Robot() {
		System.out.print("Robot's constructor");
	}

	public void eat() {
	System.out.println("Eat method pr");
	}
}
public class Main extends Robot {
	String color = "red";
	public Main() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doWork();
		

	}
	public void doWork() {
		System.out.println(color);
		System.out.println(super.color);
		eat();
		super.eat();
	}
	public void eat() {
		System.out.println("Eat Method?");
	}

}
