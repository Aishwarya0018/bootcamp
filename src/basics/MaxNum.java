package basics;

import java.util.Scanner;

public class MaxNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		int a = scanner.nextInt();

		int b = scanner.nextInt();

		int c = scanner.nextInt();

		System.out.println(Integer.max(a, Integer.max(b, c)));

	}
}
