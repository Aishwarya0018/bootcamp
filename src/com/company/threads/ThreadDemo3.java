package com.company.threads;

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(Thread.currentThread().getName() + " : " + i);
		};

		Thread thread1 = new Thread(task);
		thread1.setName("IND");
		thread1.start();
		thread1.join();

		Thread thread2 = new Thread(task);
		thread2.setName("AFG");
		thread2.start();
	}
}
