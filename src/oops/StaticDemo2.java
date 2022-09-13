package oops;

public class StaticDemo2 {

	public static String company;

	static { // static block used to initialize static fields
		company = "HSBC";
	}

	public static void main(String[] args) {
		System.out.println("Company : " + company);
	}

	public static void foo() {
		System.out.println("foo from StaticDemo");
	}

}
