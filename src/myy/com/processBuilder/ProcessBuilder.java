package myy.com.processBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder builder = new ProcessBuilder(); //=>build
		try {
		Process process = builder.start(); //=>start
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		
			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
			try {
				process.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	private Process start() {
		// TODO Auto-generated method stub
		return null;
	}
}