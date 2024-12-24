package myy.com.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.LDT();

	}
	public void LDT() {
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);
		
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println("Start of Day "+ldt.with(LocalTime.MIN));
//		System.out.println("End of Day "+ldt.with(LocalTime.MAX));
	
//		LocalDateTime ldt = LocalDate.now().atStartOfDay();
//		LocalDate ld = ldt.toLocalDate();
//		System.out.println(ldt);
//		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getYear());
		}

}
