package oops;

public class StaticDemo {

	private int x = 101;

	private static int y = 202;

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();

		System.out.println(staticDemo.x);
		System.out.println(y);

		foo();

		staticDemo.bar();
	}

	public static void foo() {
		System.out.println("foo from StaticDemo: ");
	}

	public void bar() {
		System.out.println("bar from StaticDemo");
	}
}
