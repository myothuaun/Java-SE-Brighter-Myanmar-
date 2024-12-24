package myy.com.model2;

public class Student {
	private String city;
	private int studentId;
	private User user;
	public Student(String city,int studentId, User user) {
		this.city = city;
		this.studentId = studentId;
		this.user = user;
	}
	public String getCity() {
		return city;
	}
	public int getStudentId() {
		return studentId;
	}
	public User getUser() {
		return user;
	}

}
