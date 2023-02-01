package Esercizio4;

public class MainProject {

	public static void main(String[] args) {

		contoAllaRovescia(10);

	}
	
	public static void contoAllaRovescia(int a) {
		for (int i = a; i >= 0; i = i - 1)
			System.out.println(i);
	}
}
