package myy.com.processBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process process = Runtime.getRuntime().exec("ls");
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
