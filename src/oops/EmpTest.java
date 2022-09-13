package oops;

import java.util.Scanner;

public class EmpTest {
	public static void main(StringDemo[] args) {
		/*
		 * Emp emp = new Emp(); emp.setId(112); emp.setName("mahesh");
		 * 
		 * Emp emp2 = new Emp(); emp2.setId(115); emp2.setName("John");
		 * 
		 * print(emp); int x = 10; display(x); System.out.println(emp); // 112 mahesh
		 * System.out.println(x); // 10
		 */
		Scanner scanner = new Scanner(System.in);

		Emp[] employees = new Emp[3];

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter Emp " + (i + 1) + " Details: ID[int] & Name[String]");
			employees[i] = new Emp(scanner.nextInt(), scanner.next());
		}

		printArrays(employees);

		System.out.println(employees[0]);

	}

	public static void printArrays(Emp[] emps) {
		System.out.println("----------------- Employee Details ------------------");
		System.out.println("Modify First Emp Name: ");
		emps[0].setName(new Scanner(System.in).nextLine());
		for (Emp emp : emps) {
			System.out.println(emp.getName());
		}
	}

	public static void print(Emp e) {
		e.setName("Mahesh Babu");
	}

	public static void display(int m) {
		m += 10;
	}
}
