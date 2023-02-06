package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Inserisci i chilometri percorsi: ");
			int chilometri = sc.nextInt();
			System.out.println("Inserisci il consumo effettuato: ");
			int consumo = sc.nextInt();
			float divisione = chilometri / consumo;
			System.out.println(divisione);
		} catch (ArithmeticException e) {
			System.out.println("ERRORE! Non è possibile inserire il valore 0, cambiare valore numerico!");
		} catch (InputMismatchException e) {
			System.out.println("ERRORE! Inserisci valore numerico!");
		}
	}
}
