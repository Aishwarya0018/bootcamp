package com.company.threads;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.setName("IND");
		thread.start();
		thread.join();

		MyThread thread2 = new MyThread();
		thread2.setName("AFG");
		thread2.start();

		for (int i = 50; i < 60; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);

	}
}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);
	}

}
