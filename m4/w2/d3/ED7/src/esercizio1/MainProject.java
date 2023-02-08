package esercizio1;

public class MainProject {

	public static void main(String[] args) throws InterruptedException {

		ThreadTest t1 = new ThreadTest("*");
		ThreadTest t2 = new ThreadTest("#");

		t1.start();
		t1.join();
		t2.start();

	}
}
