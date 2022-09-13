package basics;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();

		String message = (age > 18) ? "You can enroll for this program"
				: "You can't enroll for this program bcz you're a minor";

		System.out.println(message);
	}
}
