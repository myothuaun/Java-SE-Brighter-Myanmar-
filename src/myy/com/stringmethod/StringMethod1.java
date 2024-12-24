package myy.com.stringmethod;

import java.util.Arrays;

public class StringMethod1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String moto = "I will learn and prepared, one day my chance will come out.";
			System.out.println(moto.charAt(5));
			System.out.println(moto.length());
			System.out.println(moto.substring(26));
			System.out.println(moto.substring(2,7));
			System.out.println(moto.contains("one"));
			String name = "mgmg";
			String name1 = " mama";
			System.out.println(name.equals(name1));
			String name3 = "";
			System.out.println(name3.isEmpty());
			
			String bb = name.concat(name1);
			bb = bb.replace("m","a" );
			System.out.println(bb);
			
			moto = moto.replace("learn","steal");
			System.out.println(moto);
			
			String [] ary = moto.split(" ");
			System.out.println(Arrays.toString(ary));
			
			System.out.println(moto.indexOf("w"));
			
			System.out.println(moto.indexOf("one"));
			
			System.out.println(moto.toLowerCase());
			System.out.println(moto.toUpperCase());
			
	 		
			
		}

}
