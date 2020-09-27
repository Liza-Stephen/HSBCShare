import java.util.logging.Logger;

public class Main {

	public static void main(String args[]) {
		Logger logger = Logger.getLogger("Hello");
		MessageBox box = new MessageBox();
		logger.info("Box created");
		Producer prod = new Producer(box);
		logger.info("producer created");
		Consumer con = new Consumer(box);
		
		new Thread(con).start();
		new Thread(prod).start();
		
	}
}
