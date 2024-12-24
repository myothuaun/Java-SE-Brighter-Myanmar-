package myy.com.printwriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    String data = "Print writer";
    String fileName = "d.txt";

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //new Main().doWrite();
        new Main().write();

    }
    public void write() throws IOException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        pw.write(data);
        pw.close();
    }
}

