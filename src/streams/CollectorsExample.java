package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
	
	public static void main(String[] args) {
		List<String> exampleList = Arrays.asList("A", "B", "C");
		
		System.out.println(exampleList.stream().collect(Collectors.joining(", ")));
	}

}
