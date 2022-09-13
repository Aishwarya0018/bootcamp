package oops;

public interface MyInterface {

	double PI = 3.14;

	void foo();

}

class MyInterfaceImpl implements MyInterface {

	@Override
	public void foo() {
		System.out.println("foo from MyInterfaceImpl");
	}
}

class TestAbstraction2 {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.foo();
	}
}