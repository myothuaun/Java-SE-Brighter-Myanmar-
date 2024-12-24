package recursion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		//fact 5 => 5*4*3*2*1
		System.out.println(m.calculate(5));
	}
	public int calculate(int num) {
		
		if(num == 1) {
			return 1;
		}
		return calculate (num-1)*num  ;
		
	}

}
