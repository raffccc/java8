package lambda;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MethodReferenceExample {
	
	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("src/lambda/" + MethodReferenceExample.class.getSimpleName() + ".java"))
				.map(String::trim)
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}