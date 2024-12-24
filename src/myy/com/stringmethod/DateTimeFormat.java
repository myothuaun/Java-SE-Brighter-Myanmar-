package myy.com.stringmethod;

import java.time.LocalDateTime;

public class DateTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime local = LocalDateTime.of(2024,8,9,10, 30,50);
		System.out.printf("Cuttent time is %tY %<tm %<td %<tH %<tM %<tS", local);

	}

}
