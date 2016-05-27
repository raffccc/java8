package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class SummaryStatistics {
	
	public static void main(String[] args) throws IOException {
		
		IntSummaryStatistics statistics = 
				Files.lines(Paths.get("src/streams/" + CollectorsExample.class.getSimpleName() + ".java"))
				.map(String::trim)
				.collect(Collectors.summarizingInt(String::length));
		
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
	}

}
