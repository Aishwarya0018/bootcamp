package oops;

public class B extends A {

	@Override
	public void bar() throws ArrayIndexOutOfBoundsException {
		System.out.println("bar from B");
	}

}

class TestInheritance2 {
	public static void main(String[] args) {
		B bObject = new B();
		bObject.bar();
	}
}