package esercizio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		array[0] = (int) (Math.random() * 10);
		array[1] = (int) (Math.random() * 10);
		array[2] = (int) (Math.random() * 10);
		array[3] = (int) (Math.random() * 10);
		array[4] = (int) (Math.random() * 10);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		try {
			System.out.println(
					"Decidi, da 1 a 5, quale numero cambiare e in quale posizione cambiarlo, altrimenti premi 0 e concludi!");
			int scelta = sc.nextInt();

			switch (scelta) {
			case 0:
				System.out.println("Hai deciso di mantenere le condizioni iniziali!");
				break;
			case 1:
				System.out.println("Hai deciso di sostituire il numero alla prima posizione!");
				int primo = sc.nextInt();
				array[0] = primo;
				break;
			case 2:
				System.out.println("Hai deciso di sostituire il numero alla seconda posizione!");
				int secondo = sc.nextInt();
				array[1] = secondo;
				break;
			case 3:
				System.out.println("Hai deciso di sostituire il numero alla terza posizione!");
				int terzo = sc.nextInt();
				array[2] = terzo;
				break;
			case 4:
				System.out.println("Hai deciso di sostituire il numero alla quarta posizione!");
				int quarto = sc.nextInt();
				array[3] = quarto;
				break;
			case 5:
				System.out.println("Hai deciso di sostituire il numero alla quinta posizione!");
				int quinto = sc.nextInt();
				array[4] = quinto;
				break;
			default:
				System.out.println("Hai scelto un numero maggiore di 5, stampa nuovamente l'array senza alcuna modifica!");
			}
		} catch (InputMismatchException e) {
			System.out.println("ERRORE! Inserisci valore numerico!");
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
