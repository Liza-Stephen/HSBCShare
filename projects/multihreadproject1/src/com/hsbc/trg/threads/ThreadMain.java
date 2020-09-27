package com.hsbc.trg.threads;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		int n1[] = { 12, 23, 34, 45, 56, 67, 78, 89 };

		int n2[] = { 112, 123, 145, 167, 234, 267, 289, 290, 321, 322, 356 };
		
		NumberThread nt1 = new NumberThread(n1);
		NumberThread nt2 = new NumberThread(n2);
		
		Thread t1=new Thread(nt1);
		Thread t2=new Thread(nt2);
		t1.start();
		
	//	t1.join();
		
		
		t2.start();
		
		t1.start();
		System.out.println("Threads started");
	}

}
