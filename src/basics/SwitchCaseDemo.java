package basics;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Day Num:");
		int dayNum = sc.nextInt();

		String result = switch (dayNum) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wed";
		case 4 -> "Thu";
		case 5 -> "Fri";
		case 6 -> "Sat";
		case 7 -> "Sun";
		default -> throw new IllegalArgumentException("Unexpected value: " + dayNum);
		};

		System.out.println(result);

		switch (dayNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Input!!");
			break;
		}

	}

}
