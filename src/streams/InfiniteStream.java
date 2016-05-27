package streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class InfiniteStream {
	
	public static void main(String[] args) {
		Stream<Double> randomGenerator = Stream.generate(() -> Math.random());
		Stream<Integer> iterate = Stream.iterate(1, i -> i+1);
		DoubleStream doubles = new Random().doubles();
		
		randomGenerator.forEach(System.out::println);
	}

}
