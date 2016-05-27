package datetimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwardCompatibilityExample {

	public static void main(String[] args) {
		Date now = new Date();
		Instant nowInstant = now.toInstant();
		LocalDateTime dateTime = LocalDateTime.ofInstant(nowInstant, ZoneId.systemDefault());
		System.out.println(dateTime);
		
		ZonedDateTime zoneDateTime = ZonedDateTime.ofInstant(nowInstant, ZoneId.systemDefault());
		System.out.println(zoneDateTime);
	}
	
}
