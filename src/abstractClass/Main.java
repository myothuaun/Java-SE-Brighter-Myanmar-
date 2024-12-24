package abstractClass;

public class Main extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Main().name);
		
		new Main().task();
		
		new Main().doIt();

	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void count(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void task(String data) {
		// TODO Auto-generated method stub
		
	}

}
