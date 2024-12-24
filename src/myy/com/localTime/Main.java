package myy.com.localTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.LDT();
	}
	public void LDT(){
//		LocalTime localTime = LocalTime.now();
//		System.out.println(localTime);
		
		LocalTime localTime = LocalTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Asia/Tokyo"));	
		System.out.println(zdt);
	}

}
