package com.company.threads;

import java.util.Iterator;

public class ThreadDemo2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Thread11 task = new Thread11();
			Thread thread = new Thread(task);
			thread.setName("thread" + i);
			thread.start();
		}

		for (int i = 90; i < 100; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);

	}
}

class Thread11 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);
	}

}
