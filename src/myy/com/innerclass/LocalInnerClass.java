package myy.com.innerclass;

public class LocalInnerClass {
	public static void main(String [] args) {
		CarEngine m = new CarEngine();
		m.start();
		
		
	}
}
class CarEngine{
	public void start() {
		System.out.println("Car engine is start");
		class Robot{
			public void start(){
				System.out.println("Robot is start");
			}
		}
		Robot r = new Robot();
		r.start();
	}
}
