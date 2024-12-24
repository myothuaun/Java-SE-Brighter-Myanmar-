package myy.com.Enum;

public class User {
	String name;
	Enum type;
	
	public User(String name,Enum type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public Enum getType() {
		return type;
	}
}
