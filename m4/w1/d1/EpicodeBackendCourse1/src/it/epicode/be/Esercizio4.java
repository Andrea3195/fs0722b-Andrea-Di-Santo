package it.epicode.be;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserisci base e altezza di un rettangolo");
		System.out.print("Inserisci la base: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.print("Inserisci l'altezza: ");
		double a = Double.parseDouble(sc.nextLine());

		double pr = perimetroRettangolo(b, a);
		System.out.println("Il perimetro del rettangolo è: " + pr);

		System.out.print("Inserisci un numero intero: ");
		int num = Integer.parseInt(sc.nextLine());

		int pd = pariDispari(num);
		if (pd == 0) {
			System.out.println("Il numero inserito è pari!");
		} else {
			System.out.println("Il numero inserito è dispari!");
		}

	}

	public static double perimetroRettangolo(double b, double a) {
		return b * 2 + a * 2;
	}

	public static int pariDispari(int n) {
		return (n % 2);
	}

}
