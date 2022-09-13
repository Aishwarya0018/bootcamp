package oops;

public class StringDemo {
	public static void main(String[] args) {
		// approach-1

		char[] chars = new char[] { 'h', 'e', 'l', 'l', 'o' };

		String string = new String(chars);

		System.out.println(string);

		// approach-2
		String string2 = new String("hello");
		System.out.println(string2);

		// approach-3 flyweight design pattern
		String string3 = "hello";
		String string4 = "hello";

		String string5 = new String("hello");
		System.out.println(string3);

		System.out.println(string == string2); // false
		System.out.println(string == string3); // false
		System.out.println(string3 == string4); // true
		// System.out.println(string.equals(string2));
		// System.out.println(string.equals(string3));

	}
}
