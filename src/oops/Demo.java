package oops;

public class Demo {
	// instance variables
	private int i;
	private int j;

	public Demo() { // parameterless
	}

	public Demo(int i, int j) { // parameterized
		this(j); // constructor chaining
		this.i = i;
	}

	public Demo(int j) { // parameterized
		this.j = j;
	}

	public void print() {
		System.out.println("print from Demo");
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}

}

class DemoTest {
	public static void main(String[] args) {
		Demo demo = new Demo(11, 22);
		demo.print();
	}
}