package Esercizio2;

public class Call {

	double durata;
	String numeroChiamato;

	public Call(double durata, String numeroChiamato) {
		this.durata = durata;
		this.numeroChiamato = numeroChiamato;
	}

	@Override
	public String toString() {
		return "(Durata chiamata = " + durata + " min." + " - Numero chiamato = " + numeroChiamato + ")";
	}

}