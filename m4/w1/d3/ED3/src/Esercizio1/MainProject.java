package Esercizio1;

public class MainProject {

	public static void main(String[] args) {

		stringaPariDispari("Buongiorno");
		annoBisestile(2016);

	}

	public static void stringaPariDispari(String a) {
		if ((a.length() % 2) == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void annoBisestile(int a) {
		if (a % 4 == 0 && a % 100 != 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
