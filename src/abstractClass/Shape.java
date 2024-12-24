package abstractClass;

public abstract class Shape implements ClickEmitter,CountEmitter {
	public String name = "mgmg";
	
	public static void task() {
		System.out.println("i am task");
	}
	
	public abstract void doIt();

}
