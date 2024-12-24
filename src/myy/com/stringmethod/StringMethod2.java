package myy.com.stringmethod;

public class StringMethod2 {
	public static void main(String [] args) {
		String moto = "I will learn, and prepared, one day my, chance will, come out.";
		String [] ary = moto.split(",",3);
		System.out.println(ary.length);
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		
		String name = "myo ";
		System.out.println(name.length());
		name = name.trim();
		System.out.println(name.length());
		
		int t = 20;
		String s = String.valueOf(t);
		System.out.println(s);
		
	}
}
