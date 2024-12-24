package myy.com.polymorphism;

class Machine{
	public void start() {
		System.out.println("Machine is start");
	}
	
}
class Camera extends Machine{
	@Override
	public void start() {
		System.out.println("Camera is start");
	}
	public void snap() {
		System.out.println("Camera Snapping");
	}

}
class Car extends Machine{
	@Override
	public void start() {
		System.out.println("Car is starting");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		
		Machine m2 = new Camera();
		Machine m3 = new Car();
		doIt(m3);
		
	}


	public static void doIt(Machine m) {
	m.start();
	}
}
