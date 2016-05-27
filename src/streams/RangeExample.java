package streams;

import java.util.stream.IntStream;

public class RangeExample {
	
	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(System.out::println);
	}

}
