package myy.com.array;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 20;
		numbers[3] = 20;
		numbers[4] = 50;
		System.out.println(numbers[4]);
		String ary = Arrays.toString(numbers); //array to string
		System.out.println(ary);
		
		String [] men = {"ironman","batman","superman","spiderman"};
		System.out.println(men.length); //array method
		System.out.println(men[2]);
		boolean b = Arrays.asList(men).contains("batman"); //array check list
		System.out.println(b);
		System.out.println("=================");
		
		int [] num = {1,2,3,4,5};
		int [] copyAry = new int[4];
		System.arraycopy(num, 0, copyAry, 0, 4); // copy array
		System.out.println(Arrays.toString(copyAry));
		int [] desAry = Arrays.copyOfRange(num,0 , 3);
		System.out.println(Arrays.toString(desAry));
		
		String [] [] name ={
				{"mgmg","aungaung","kyawkyaw"},
				{"susu","myamya","ayeaye"},
				{"U hla","D soe"}
			};
		System.out.println(name[1][2]);
		
		String [][][] names = {
				{
				{"one","two","three"},
				{"four","five","seven"},
				{"eight","nine","ten"}
				},
				{
				{"a","b","c"}
				},
				{
				{"d","e","f"}
				}
		};
		System.out.println(names[0][2][1]);
				
	}

}
