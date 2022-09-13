package com.company.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListDemo2 {
	public static void main(String[] args) {
		List<Emp> employees = new ArrayList<>(20);
		employees.add(new Emp(101, "neha", "neha@email.com"));
		employees.add(new Emp(102, "nawaz", "nawaz@email.com"));
		employees.add(new Emp(103, "nupur", "nupur@email.com"));
		employees.add(new Emp(104, "radha", "radha@email.com"));
		employees.add(new Emp(105, "santosh", "santosh@email.com"));

		employees.add(1, new Emp(106, "tanya", "tanya@email.com"));
		// employees.removeIf(x -> x.getEmail().equals("neha@email.com"));

		List<Emp> dbs = new ArrayList<>();
		dbs.add(new Emp(111, "anand", "anand@email.com"));
		dbs.add(new Emp(122, "joe", "joe@emal.com"));

		employees.addAll(dbs);

		employees.forEach(System.out::println);

		employees.clear();
		System.out.println(employees.size());

		employees.forEach(System.out::println);
	}
}

class Emp implements Comparable<Emp> {
	private int empId;
	private String name;
	private String email;

	public Emp(int empId, String name, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, empId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(email, other.email) && empId == other.empId && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Emp o) {
		return this.getName().compareTo(o.getName());
	}

}