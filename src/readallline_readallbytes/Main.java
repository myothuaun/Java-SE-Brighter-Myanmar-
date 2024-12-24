package readallline_readallbytes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;


public class Main {
	 String data = "read all line and read all bytes";
	 String fileName = "c.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 new Main().write();
		 new Main().read();
	}
	 public void write() throws IOException {
	        File file = new File(fileName);
	        PrintWriter pw = new PrintWriter(file);
	        pw.write(data);
	        pw.close();
	 }
	 public void read() throws IOException {
		 List<String> list = Collections.emptyList();
		 list = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		 System.out.println(list);
	 }

}
