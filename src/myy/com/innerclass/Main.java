package myy.com.innerclass;

public class Main {
	public static void main(String [] args) {
	Machine m = new Machine();
	m.start();
	Machine.Camera.snap();
	}
}
class Machine{
	public String name = "Phone";
	public void start() {
		System.out.println(name + " is start!");
	}
	
	static class Camera{
		static int id = 3;
		public static void snap() {
			System.out.println("Taking a snap Using camera " + id);
		}
	}
}


