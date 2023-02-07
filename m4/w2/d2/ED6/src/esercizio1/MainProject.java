package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainProject {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		Set<String> duplicated = new HashSet<String>();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Scrivi il numero di parole che vuoi inserire: ");
			int num = sc.nextInt();

			System.out.println("Scrivi le parole che vuoi inserire: ");

			for (int i = 0; i < num; i++) {

				String w = sc.next();

				if (s.contains(w)) {
					duplicated.add(w);
				}
				s.add(w);
			}
			System.out.println(s);

			int length = s.size();
			System.out.println("La lunghezza della tua lista è: " + length);
			System.out.println("Parole duplicate: " + duplicated);
		} catch (java.util.InputMismatchException e) {
			System.out.println("ERRORE! Inserisci un valore numerico!");
		}
	}
}
