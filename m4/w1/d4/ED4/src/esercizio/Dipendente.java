package esercizio;

public class Dipendente {

	static double stipendioBase = 1200;

	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello Livello;
	private Dipartimento Dipartimento;

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return Dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		Dipartimento = dipartimento;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLivello() {
		return Livello;
	}
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		Dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.Livello = Livello.OPERAIO;
	}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		Livello = livello;
		Dipartimento = dipartimento;
	}

	public void stampaDatiDipendente() {
		System.out.println("Matricola: " + this.matricola);
		System.out.println("Stipendio: " + this.stipendio);
		System.out.println("Importo Orario Straordinario: " + this.importoOrarioStraordinario);
		System.out.println("Livello: " + this.Livello);
		System.out.println("Dipartimento: " + this.Dipartimento);
	}

	public Livello promozione() {
		if (this.Livello == Livello.OPERAIO) {
			this.Livello = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
		} else if (this.Livello == Livello.IMPIEGATO) {
			this.Livello = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
		} else if (this.Livello == Livello.QUADRO) {
			this.Livello = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
		} else if (this.Livello == Livello.DIRIGENTE) {
			System.out.println("Non è possibile promuovere il dipendente " + this.matricola);
		} else {
			System.out.println("Non è possibile promuovere il dipendente");
		}

		return this.Livello;
	}

	public static double calcolaPaga(Dipendente a) {
		return a.getStipendio();
	}

	public static double calcolaPaga(Dipendente a, int oreStraordinario) {
		double straordinario = oreStraordinario * a.getImportoOrarioStraordinario();
		return a.getStipendio() + straordinario;
	}
}
