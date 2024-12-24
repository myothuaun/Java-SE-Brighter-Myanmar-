package myy.com.model;

public class Users {
	private String name,car ,city;
	private int age;
	private double height;
	public Users(String name,String car,String city,int age,double height) {
		this.name = name;
		this.car = car;
		this.city = city;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public String getCar() {
		return car;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	

}
