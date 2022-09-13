package oops;

public class StaticDemo3 {

	{
		System.out.println("Let's do something amazing!");
	}

	static {
		System.err.println("Match is not yet over!!");
	}

	public static void main(String[] args) {
		StaticDemo3 object = new StaticDemo3();
		object.doAmazingThings();
	}

	public void doAmazingThings() {
		System.out.println("We'll play again");
	}

}
