package myy.com.constructorwiththiskeyword;

public class Square{
	public int width = 50;
		
		public Square(int width) {
		System.out.println("method var width is "+ width);
		
		System.out.println("class var width is "+ this.width);
		this.width = width;
		System.out.println("reassign value of class var width is "+width);
	}
	
//		private int width;
//		public Square(int width) {
//		this.width = width;
//		System.out.println("width is " + this.width);
//	}
	
//		public int width = 50;		    //instance variable
//		public static int height  = 30; //class variable
//		public Square (int width) {     //=>parameter variable
//		int area = 20;			    //=>local variable
//	}
	
	
}
