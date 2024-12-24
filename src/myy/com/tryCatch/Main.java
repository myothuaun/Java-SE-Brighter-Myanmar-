package myy.com.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		doWork();
	}
	public static void doWork() throws FileNotFoundException {
//		Machine m = new Machine();
//		File file = new File("text.txt");
//		try {
//			FileReader reader = new FileReader(file);
//			BufferedReader br = new BufferedReader(reader);
//			String line;
//			while((line = br.readLine()) != null) {
//				
//			}
//		
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		String [] ary = {"one","two"};
		try {
			//int result = 7/0; //=> runtime errors
			System.out.println(ary[3]);
		
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}finally {
			try {
			String num = ary[3];
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
}
}
}