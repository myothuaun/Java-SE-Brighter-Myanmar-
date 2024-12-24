package myy.com.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy b = new Boy();
		b.getParent();
		System.out.println(b.name);
		Girl g = new Girl();
		g.getParent();
		g.myMethod();
		System.out.println(g.getTotalStudents());
		g.sayMyName();
		
		//type casting=>Up
		Students [] stus = {new Boy(),new Girl()};
		for(int i = 0;i<=4;i++) {
		switch(i%2) {
		case 0:
			System.out.println(((Boy) stus[0]).name);
			break;
		case 1:
			System.out.println(((Girl) stus[1]).name);
			break;
		}
		}
	}

}
