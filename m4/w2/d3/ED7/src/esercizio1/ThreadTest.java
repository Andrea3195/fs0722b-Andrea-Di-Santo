package esercizio1;

public class ThreadTest extends Thread {

	private String message;

	public ThreadTest(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
