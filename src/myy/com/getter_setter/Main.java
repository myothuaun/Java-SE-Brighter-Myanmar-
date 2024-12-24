package myy.com.getter_setter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj = new Square(1,2,3);
		obj.setName("myothuaung");
		System.out.println(obj.getName());
		obj.setAge(22);
		System.out.println(obj.getAge());
		
		
		
		System.out.println(obj.getWidth());
		System.out.println(obj.getHeight());
		System.out.println(obj.getArea());
		

	}

}
