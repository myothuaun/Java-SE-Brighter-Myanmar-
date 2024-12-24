package myy.com.conditionalstatement;

public class ConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if
		//if else
		//if elseif else
		//for loop
		for(int i=0;i<5;i++) {
			System.out.println(i);
		};
		System.out.println("===================");
		//while loop
		int j = 0;
		while(j<5) {
			System.out.println(j);
			j++;
		};
		System.out.println("===================");
		//do while loop
		int k = 0;
		do {
			System.out.println(k);
			k++;
			}while(k<5);
		System.out.println("===================");
		//for each loop = >arrays,lists,vectors,sets,maps
		int [] numbers = {1,2,3,4};
		for(int num: numbers) {
			System.out.println(num);
		}
		System.out.println("===================");
		//Switch Statement
		int vowel = 'u';
		switch(vowel) {
		case 'a':
			System.out.println("this is vowel");
			break;
		case 'e':
			System.out.println("this is vowel");
			break;
		case 'i':
			System.out.println("this is vowel");
			break;
		case 'o':
			System.out.println("this is vowel");
			break;
		case 'u':
			System.out.println("this is vowel");
			break;
		default:
			System.out.println("This is not vowel");
		}

	}

}
