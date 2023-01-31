package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];

		System.out.print("Inserire la prima stringa: ");
		arr[0] = sc.nextLine();

		System.out.print("Inserire la seconda stringa: ");
		arr[1] = sc.nextLine();

		System.out.print("Inserire la terza stringa: ");
		arr[2] = sc.nextLine();

		System.out.println("Stringa in ordine: ");
		System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2]);

		System.out.println("Stringa in ordine inverso: ");
		System.out.println(arr[2] + " - " + arr[1] + " - " + arr[0]);

	}

}
