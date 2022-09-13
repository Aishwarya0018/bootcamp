package oops;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hello");
		builder.append(" world");
		System.out.println(builder);
		System.out.println(builder.reverse());
		System.out.println(builder.length());

		StringBuffer buffer = new StringBuffer("welcome to hsbc");
		System.out.println(buffer);
		System.out.println(buffer.reverse());
	}
}
