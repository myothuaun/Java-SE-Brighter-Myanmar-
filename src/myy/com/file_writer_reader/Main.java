package myy.com.file_writer_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	String data = "FileReader";
	String fileName = "mine.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//new Main().doWrite();
		new Main().doRead();
	}
	public void doWrite() throws IOException {
		File file = new File("mine.txt");
		FileWriter fw = new FileWriter(file,true);
		//fw.write(data);
		fw.append("AA");
		fw.close();
	}
	public void doRead() throws IOException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
	}
}
