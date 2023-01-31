package Esercizio1;

public class Rectangle {

	double base;
	double height;

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double perimeter() {
		return this.height * 2 + this.base * 2;
	}
	
	public double area() {
		return this.height * this.base;
	}

}
