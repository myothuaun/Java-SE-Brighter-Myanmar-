package myy.com.method;

public class Method {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.task();
		hey();
		System.out.println(a());
		
		obj.heyNow();

	}
	public void task() { //non static
		System.out.println("non static method");
	}
	public static void hey() { //static 
		System.out.println("i am static method");
	}
	public static int a() { //string,boolean
		return 10;
		
	}
	///////////////////////////////////////////////////////
	public void heyNow() {
		theEnd();
	}
	public static void theEnd(){
		System.out.println("end of program");
	}


}
