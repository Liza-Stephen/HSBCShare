class Consumer implements Runnable {
	MessageBox box;

	public Consumer(MessageBox box) {
		this.box = box;

	}

	public void run() {
		int i = 0;
		while (++i < 6) {
			String msg=box.get();
			System.out.println("Got "+msg);
		}
	}
}
