package myy.com.tryCatch;

import java.io.File;
import java.io.FileReader;

public class Machine {
	public void readFile(File file) throws HaveNoInternetException {
	boolean isConnected = false;
	if(! isConnected) {
		throw  new HaveNoInternetException("No internet Connection!");
	}
		
	}
}
