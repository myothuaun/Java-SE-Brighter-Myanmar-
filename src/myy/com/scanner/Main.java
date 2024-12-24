package myy.com.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    String data = "Scanner";
    String fileName = "c.txt";

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        new Main().read();

    }
    public void read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter("\\z");
        System.out.println(scanner.next());
    }

}
