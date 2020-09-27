public class Main {

	public static void main(String args[]) {
		MessageBox box = new MessageBox();
		Producer prod = new Producer(box);
		Consumer con = new Consumer(box);
		new Thread(con).start();
		new Thread(prod).start();
	}
}
