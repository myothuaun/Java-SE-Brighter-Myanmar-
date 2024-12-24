package myy.com.getter_setter;

public class Square {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

//======> constructor as setter
	private int width;
	private int height;
	private int area;
	
	public Square(int width,int height,int area) {
		this.width = width;
		this.height = height;
		this.area = area;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getArea() {
		return area;
	}
	

}
