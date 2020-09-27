class Consumer implements Runnable {
	MessageBox box;

	public Consumer(MessageBox box) {
		this.box = box;

	}

	public void run() {
		int i = 0;
		while (++i < 6) {
			box.get();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
}
