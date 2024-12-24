package protectedaceessmodifier;

import abstractClass.ClickEmitter;
import protectedaccessmodifier.test.Mom;

public class Main implements ClickEmitter {
	private char[] name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dad d = new Dad();
		System.out.println(d.name);
		Mom m= new Mom();
		System.out.println(m.name);
		
//		Main main = new Main();
//		System.out.println(main.name);
	
	}

	@Override
	public void task(String data) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void count(int i) {
		// TODO Auto-generated method stub
		
	}


}
