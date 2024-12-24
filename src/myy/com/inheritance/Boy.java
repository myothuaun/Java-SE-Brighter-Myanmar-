package myy.com.inheritance;

public class Boy extends Students{
	public void getParent() { //override 
		this.name = "myothuaung";
		System.out.println("I override it");
	}
	public void myMethod() {
		System.out.println("I am My own method");
	}

}
