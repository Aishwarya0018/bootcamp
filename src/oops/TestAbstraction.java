package oops;

public class TestAbstraction {
	public static void main(String[] args) {
		MyAbstract myAbstract = new MyAbstractChild("rohit");

		myAbstract.foo();
//		myAbstract.foobar();
	}

}
