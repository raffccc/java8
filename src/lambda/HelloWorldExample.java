package lambda;


public class HelloWorldExample {
	Runnable r1 = () -> System.out.println(this);
	Runnable r2 = () -> System.out.println(toString());
	
	@Override
	public String toString() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		new HelloWorldExample().r1.run();
		new HelloWorldExample().r2.run();
		
		String s = "Test of Scope";
		Runnable r3 = () -> System.out.println(s);
		r3.run();
		
		//s = ""; if you reasign s, it generates a compilation error
	}

}