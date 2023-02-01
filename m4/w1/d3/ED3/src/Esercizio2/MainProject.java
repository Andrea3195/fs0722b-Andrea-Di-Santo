package Esercizio2;

public class MainProject {

	public static void main(String[] args) {

		stampaNumero(3);

	}

	public static void stampaNumero(int n) {
		switch (n) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		default:
			System.out.println("Errore");
		}
	}
}
