package myy.com.buffer_writer_reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	String data = "BufferedWriter and BufferReader";
	String fileName = "main.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Main().write();
	}
	public void write() throws IOException {
		BufferedWriter br = new BufferedWriter (new FileWriter(new File(fileName)));
		br.write(data);
		br.close();
	}
	public void read() throws IOException {
		BufferedReader br = new BufferedReader (new FileReader(new File(fileName)));
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		
		}
		
	}
}
