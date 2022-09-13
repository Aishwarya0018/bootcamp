package com.company.threads;

public class Table {

	public void getTable(int num) {
		System.out.println("Displaying  Table for " + num);

		synchronized (this) {
			for (int i = 1; i <= 10; i++)
				System.out.println(num + " * " + i + " : " + (num * i));
		}

	}
}

class ThreadDemo4 {
	public static void main(String[] args) {
		Table table = new Table();

		Runnable task1 = () -> {
			table.getTable(2);
		};

		Runnable task2 = () -> {
			table.getTable(5);
		};

		Runnable task3 = () -> {
			table.getTable(7);
		};

		Thread t1 = new Thread(task1);
		t1.start();

		Thread t2 = new Thread(task2);
		t2.start();

		Thread t3 = new Thread(task3);
		t3.start();
	}
}
