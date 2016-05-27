package defaultmethods;

public class StaticMethodInInterface {
	
	interface Foo {
		static void talk() {
			System.out.println("Hi!");
		}
	}
	
	public static void main(String[] args) {
		Foo.talk();
	}

}
