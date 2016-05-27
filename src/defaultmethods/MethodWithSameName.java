package defaultmethods;

public class MethodWithSameName {
	
	interface Foo {
		default void talk() {
			System.out.println("foo");
		}
	}
	
	interface Bar {
		default void talk() {
			System.out.println("bar");
		}
	}
	
	static class Test implements Foo, Bar {
		@Override
		public void talk() {
			Foo.super.talk();
		}
	}
	
	public static void main(String[] args) {
		new Test().talk();
	}

}
