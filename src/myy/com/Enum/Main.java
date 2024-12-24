package myy.com.Enum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("mgmg", MemberAccess.FREE);
		User user2 = new User("koko",MemberAccess.DIAMON);
		if(user1.getType() == MemberAccess.FREE) {
			System.out.println(user1.getName() + " have " +  MemberAccess.FREE.toString());
		}
		
		for(Car car:Car.values()) {
			System.out.println("Car name is " + car 
							   + " price is " + car.getPrice() 
							   +"lakhs made in "+ car.getYear());
		}
	}

}
