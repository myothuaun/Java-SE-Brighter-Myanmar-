package myy.com.method;

public class methodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task(5,10); //Arguments
		System.out.println(addition(2,2));
		String myBio = bio("myothuaung",22);
		System.out.println(myBio);
	}
	public static void task(int a, int b) { //parameters
		int result = a + b;
		System.out.println("number is = "+result);	
	}
	public static int addition(int x,int y) {
		int z = x + y;
		return z;	
	}
	public static String bio(String p, int q) {
		
		return " My name is " + p + " and age is " + q;
		
	}

}
