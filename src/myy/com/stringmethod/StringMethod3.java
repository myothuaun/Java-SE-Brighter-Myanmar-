package myy.com.stringmethod;

import java.util.ArrayList;

public class StringMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "mgmg";
		String name2 = "mg";
		if(name1.contentEquals(name2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals!");
		}
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		String str = "";
		str = str.join("-",list);
		System.out.println(str);
		
		String name3 ="myo";
		for(int i = 0;i<name3.length();i++) {
			char ch = name3.charAt(i);
			System.out.println((int)ch);                                                                 
		}
		
		
		
	}

}
