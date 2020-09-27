public class MessageBox {
	String message = null;

	synchronized String get() {

		if (message == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		
		
		String m = message;
		message = null;
		notify();
		return m;
	}

	synchronized void put(String message) {
		if (this.message != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		
		
		this.message = message;
		System.out.println("Put: " + message);

		notify();
	}
}
