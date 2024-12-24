package myy.com.innerclass;
class Papa{
	public void showMyName() {
		System.out.println("PaPa");
	}
}
class Mama extends Papa{
	@Override
	public void showMyName() {
		System.out.println("MaMa");
	}
}
interface Executable{
	void execute();
}

public class AnonymousClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Papa papa = new Papa() {
			@Override
			public void showMyName() {
				System.out.println("i am anonymous class");
			}
			
		};
		papa.showMyName();
		
		Executable executer = new Executable() {
			public void execute() {
				System.out.println("Executing Data");
			}
		};
		executer.execute();
		
		
	
	}

}

