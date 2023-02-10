package progetto;

public class Riviste extends CatalogoBiblioteca {

	private Enum PeriodoStampa;

	public Riviste(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine, Enum PeriodoStampa) {
		super(codiceIsbn, titolo, annoPublicazione, numeroPagine);
		this.PeriodoStampa = PeriodoStampa;
	}

	public Enum getPeriodicita() {
		return PeriodoStampa;
	}

	public void setPeriodicita(Enum periodoStampa) {
		PeriodoStampa = periodoStampa;
	}

}
