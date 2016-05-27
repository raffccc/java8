package streams;

import java.util.stream.Stream;

public class StreamAnythingExample {

	public static void main(String[] args) {
		Stream.of(1,2,3d,4l,0b1001).forEach(System.out::println)	;
	}
	
}
