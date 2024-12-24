package myy.com.stringmethod;

public class StringFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("myo");
		sb.append(" thu");
		sb.append(" aung");
		
		String str = sb.toString();		
		System.out.println(str);
		
		String name1 = "mgmg";
		String name2 = "mama";
		String st = null;
		
		System.out.printf("mg brother name is %s and my sister name is %s.\n",name1,name2);
		System.out.printf("values is %b", st);
	}

}
