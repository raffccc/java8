package lambda;
import java.util.function.Function;


public class FunctionalInterfacesExample {
	
	public static void main(String[] args) {
		Function<String, String> f1 = (name) -> "@" + name;
		System.out.println(f1.apply("abc"));
		
		Function<String, Integer> f2 = (name) -> name.length();
		Function<String, Integer> f3 = String::length;
		
		System.out.println(f2.apply("abc"));
		System.out.println(f3.apply("abc"));
	}

}