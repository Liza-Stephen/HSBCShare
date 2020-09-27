public class MessageBox {
	String message;

	synchronized String get() {
		System.out.println("Got: " + message);
		return message;
	}

	synchronized void put(String message) {
		this.message = message;
		System.out.println("Put: " + message);
	}
}
