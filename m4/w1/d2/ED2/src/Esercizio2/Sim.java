package Esercizio2;

public class Sim {

	String telefono;
	double creditoResiduo;
	Call[] chiamate;

	public Sim(String telefono) {
		this.telefono = telefono;
		this.creditoResiduo = 0;
		this.chiamate = new Call[5];
	}

	public void chargeSim(double credito) {
		this.creditoResiduo += credito;
	}

	public void call(double durata, String numeroChiamato) {
		Call c = new Call(durata, numeroChiamato);
		if (this.chiamate[0] == null)
			this.chiamate[0] = c;
		else if (this.chiamate[1] == null)
			this.chiamate[1] = c;
		else if (this.chiamate[2] == null)
			this.chiamate[2] = c;
		else if (this.chiamate[3] == null)
			this.chiamate[3] = c;
		else if (this.chiamate[4] == null)
			this.chiamate[4] = c;
	}

	public void printSim() {
		System.out.println("Numero Telefonico: " + this.telefono);
		System.out.println("Credito Residuo: " + this.creditoResiduo);
		this.printLast5Calls();
	}

	public void printLast5Calls() {
		if (this.chiamate[0] != null)
			System.out.println("Chiamata 1: " + this.chiamate[0]);
		if (this.chiamate[1] != null)
			System.out.println("Chiamata 2: " + this.chiamate[1]);
		if (this.chiamate[2] != null)
			System.out.println("Chiamata 3: " + this.chiamate[2]);
		if (this.chiamate[3] != null)
			System.out.println("Chiamata 4: " + this.chiamate[3]);
		if (this.chiamate[4] != null)
			System.out.println("Chiamata 5: " + this.chiamate[4]);
	}

}
