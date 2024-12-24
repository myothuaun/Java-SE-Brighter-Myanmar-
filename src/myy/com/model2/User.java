package myy.com.model2;

public class User {
	private String name,color;
	private int age;
	private double height;
	public User(String name,String color,int age,double height){
		this.name = name;
		this.color = color;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public String getColors() {
		return color;
	}
	public int getAge() {
	return age;
	}
	public double getHeight() {
	return height;
	}

}
