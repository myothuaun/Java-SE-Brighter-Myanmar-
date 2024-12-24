package myy.com.staticFinal;

public class Main {
	static String name = "myo";
	static {
		System.out.println("Static member first working");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
	static void doIt() {
		System.out.println(name);
	}
	
}
