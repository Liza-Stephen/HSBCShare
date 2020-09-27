class Producer implements Runnable {
	MessageBox myBox;

	Producer(MessageBox box) {
		myBox = box;

	}

	public void run() {
		int i = 0;
		while (++i <6) {
			myBox.put("Message " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
}