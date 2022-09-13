package oops;

public abstract class MyAbstract {

	String name;

	MyAbstract(String name) {
		this.name = name;
	}

	public abstract void foo();

	public void bar() {
		System.out.println("bar from MyAbstract");
	}

	public final void process() {
		System.out.println("process from MyAbstract");
	}
}

class MyAbstractChild extends MyAbstract {

	public MyAbstractChild(String name) {
		super(name);
	}
	

	@Override
	public void foo() {
		System.out.println("foo from MyAbstractChild");
		System.out.println("Name : " + name);
	}

	public void foobar() {
		System.out.println("foo-bar from MyAbstractChild");
	}

}
