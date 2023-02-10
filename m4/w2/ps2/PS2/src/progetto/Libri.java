package progetto;

public class Libri extends CatalogoBiblioteca {
	private String autore;
	private String genere;

	public Libri(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine, String autore, String genere) {
		super(codiceIsbn, titolo, annoPublicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libri [autore: " + autore + ", genere: " + genere + ", getCodiceIsbn(): " + getCodiceIsbn()
				+ ", getTitolo(): " + getTitolo() + ", getAnnoPublicazione(): " + getAnnoPublicazione()
				+ ", getNumeroPagine(): " + getNumeroPagine() + ", toString(): " + super.toString() + ", getClass(): "
				+ getClass() + ", hashCode(): " + hashCode() + "]";
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

}
