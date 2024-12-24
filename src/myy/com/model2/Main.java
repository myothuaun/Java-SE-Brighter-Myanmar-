package myy.com.model2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student [] stu = new Student[5];
		User user1 = new User("mgmg","yellow",20,5.5);
		User user2 = new User("aung","orange",21,5.6);
		User user3 = new User("tuntun","red",22,5.7);
		User user4 = new User("susu","green",23,5.8);
		User user5 = new User("ayeaye","blue",24,5.9);

		Student stu1 = new Student("yangon",1001,user1);
		Student stu2 = new Student("mandalay",1002,user2);
		Student stu3 = new Student("pyinoolwin",1003,user3);
		Student stu4 = new Student("taunggyi",1004,user4);
		Student stu5 = new Student("lashio",1005,user5);
		stu[0] = stu1;
		stu[1] = stu2;
		stu[2] = stu3;
		stu[3] = stu4;
		stu[4] = stu5;
		for(int i = 0;i<stu.length;i++){
			System.out.println(
					stu[i].getStudentId()
					+ "\t | \t" +
					stu[i].getUser().getName()
					+ "\t | \t" +
					stu[i].getCity()
					+ "   \t | \t" +
					stu[i].getUser().getColors()
					+ "\t | \t" +
					stu[i].getUser().getAge()
					+ "\t | \t" +
					stu[i].getUser().getHeight()
					);
			
		}
	}

}
