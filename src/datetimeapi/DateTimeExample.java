package datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
	
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1988, Month.NOVEMBER, 24);
		System.out.println(birthDate);
		
		LocalDate future = LocalDate.now();
		future.plus(10, ChronoUnit.DAYS);
		System.out.println(future);
	}

}
