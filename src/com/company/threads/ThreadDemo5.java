package com.company.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable task = () -> {
			int sum = 0;
			for (int i = 0; i < 10; i++)
				sum += i;
			return sum;
		};

//		ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service = Executors.newFixedThreadPool(10);
		System.out.println(service.isTerminated());
		Future future = service.submit(task);
		System.out.println(future.isDone());
		System.out.println("Sum : " + future.get());
		System.out.println(future.isDone());

		service.shutdown();
	}
}
