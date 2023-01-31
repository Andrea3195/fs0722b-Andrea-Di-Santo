package Esercizio1;

public class MainProject {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(20, 10);
		Rectangle r2 = new Rectangle(30, 15);
		printRectangle(r1);
		printTwoRectangles(r1, r2);

	}

	public static void printRectangle(Rectangle r) {
		System.out.println("Perimetro: " + r.perimeter());
		System.out.println("Area: " + r.area());
	}

	public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
		
		printRectangle(r1);
		printRectangle(r2);
		System.out.println("Somma Perimetro: " + (r1.perimeter() + r2.perimeter()));
		System.out.println("Somma Area: " + (r1.area() + r2.area()));
		
	}

}
