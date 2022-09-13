package oops;

import java.util.Scanner;

public class Employee {
	String name;
	String email;
	Double salary;

	public Employee() {
	}

	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public void showEmployees() {
		System.out.println("--- Employee Details ---");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
	}

}

class PermanentEmployee extends Employee {
	Double bonus;

	public PermanentEmployee(String name, String email, Double salary, Double bonus) {
		super(name, email, salary);
		this.bonus = bonus;
	}

	public PermanentEmployee() {
		super();
	}

	@Override
	public void showEmployees() {
		super.showEmployees();
		System.out.println("Total Salary : " + (salary + bonus));
	}
}

class ContractEmployee extends Employee {
	Double bonus;

	public ContractEmployee(String name, String email, Double salary, Double bonus) {
		super(name, email, salary);
		this.bonus = bonus;
	}

	public ContractEmployee() {
		super();
	}

	@Override
	public void showEmployees() {
		super.showEmployees();
		System.out.println("Total Salary : " + (salary + bonus));
	}
}

class TestInheritance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Type : [PermanentEmployee] | [ContractEmployee]");

		String input = scanner.next();

		Employee employee = null;

		switch (input) {
		case "permanent":
		case "Permanent":
		case "PermanentEmployee":
		case "PE":
		case "pe":
			employee = new PermanentEmployee("salman", "sal@email.com", 2500.0, 500.0);
			break;

		case "contract":
		case "Contract":
		case "ContractEmployee":
		case "CE":
		case "ce":
			employee = new ContractEmployee("ravi", "ravi@email.com", 2200.0, 250.0);
			break;

		default:
			throw new IllegalArgumentException("Invalid Input : " + input);
		}

		employee.showEmployees();

		/*
		 * PermanentEmployee permanentEmployee = new PermanentEmployee("salman",
		 * "sal@email.com", 2500.0, 500.0);
		 * 
		 * 
		 * ContractEmployee contractEmployee = new ContractEmployee("ravi",
		 * "ravi@email.com", 2200.0, 250.0);
		 * 
		 * Employee[] employees = new Employee[2];
		 * 
		 * employees[0] = permanentEmployee; employees[1] = contractEmployee;
		 * 
		 * employees[0].showEmployees(); employees[1].showEmployees();
		 */
	}
}
