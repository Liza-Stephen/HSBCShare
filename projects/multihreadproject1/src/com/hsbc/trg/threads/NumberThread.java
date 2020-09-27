package com.hsbc.trg.threads;

public class NumberThread  implements Runnable {
	

	int nums[];

	public NumberThread(int[] nums) {
		super();
		this.nums = nums;
	}

	public void run() {

		int sum = 0;
		for (int x : nums) {
			System.out.println(x);
			sum = sum + x;

			try {
				Thread.sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Sum =" + sum);
	}

}
