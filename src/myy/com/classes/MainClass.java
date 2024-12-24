package myy.com.classes;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes obj = new Classes();
		obj.height = 10;
		obj.width = 20;
		int area = obj.height * obj.width;
		System.out.println(area);
		
		Square obj1 = new Square();
		obj1.task();
		String myy = obj1.hey("myothuaung");
		System.out.println(myy);
		
		obj1.test();
		obj1.test("mgmg",22);
	}

}
