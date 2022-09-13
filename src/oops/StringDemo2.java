package oops;

public class StringDemo2 {

	public static void main(String[] args) {
		String string = "Hello";

		string = string.concat(" world!");

		System.out.println(string); // immutable
		System.out.println(string);

		System.out.println(string.toUpperCase());
		System.out.println(string.charAt(0));
		System.out.println(string.contains("ell"));
		System.out.println(string.endsWith("lo"));
		System.out.println(string.lines().count());

		String strings = """



					hey there
					how r you
					wht's weekend plan
					i will go lonewala!!




				""";
		System.out.println(strings);
		System.out.println(strings.lines().count());
		System.out.println(strings.strip());
	}

}
