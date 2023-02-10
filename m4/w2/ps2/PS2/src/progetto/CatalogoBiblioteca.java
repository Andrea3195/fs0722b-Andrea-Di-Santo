package progetto;

public abstract class CatalogoBiblioteca {
	private int codiceIsbn;
	private String titolo;
	private int annoPublicazione;
	private int numeroPagine;

	public CatalogoBiblioteca(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine) {
		super();
		this.codiceIsbn = codiceIsbn;
		this.titolo = titolo;
		this.annoPublicazione = annoPublicazione;
		this.numeroPagine = numeroPagine;
	}

	public int getCodiceIsbn() {
		return codiceIsbn;
	}

	public void setCodiceIsbn(int codiceIsbn) {
		this.codiceIsbn = codiceIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPublicazione() {
		return annoPublicazione;
	}

	public void setAnnoPublicazione(int annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Catalogo [codiceIsbn: " + codiceIsbn + ", titolo: " + titolo + ", annoPublicazione: " + annoPublicazione
				+ ", numeroPagine: " + numeroPagine + "]";
	}
}
