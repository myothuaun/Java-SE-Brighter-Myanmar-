package myy.com.model;

import myy.com.model.Users;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users[] users = new Users[5];
		
		Users user1 =new Users ("mg","Toyota","yangon",20,5.6);
		Users user2 =new Users ("myo","Alphbert","mandalay",21,5.7);
		Users user3 =new Users ("thu","Land Cruiser","pyinoolwin",22,5.8);
		Users user4 =new Users ("aung","Parjaro","taunggyi",23,5.8);
		Users user5 =new Users ("lar","Swift","lashio",24,5.10);
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		for(int i =0 ;i<users.length; i++) {
			System.out.println(users[i].getName()+"\t | \t"+users[i].getCar()+"   \t | \t"+users[i].getCity()
					+"   \t | \t"+users[i].getAge()+"   \t | \t"+users[i].getHeight());
		}
	}

}
