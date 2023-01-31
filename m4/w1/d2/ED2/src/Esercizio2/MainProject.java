package Esercizio2;

public class MainProject {

	public static void main(String[] args) {

		Sim sim1 = new Sim("+39 320123456");
		sim1.chargeSim(20);
		sim1.call(4.2, "+39 333123456");
		sim1.call(2.6, "+39 345123456");
		sim1.printSim();

	}
	
}
