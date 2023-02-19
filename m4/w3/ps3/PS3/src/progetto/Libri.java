package progetto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "catalogo1")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Libri extends Catalogo implements Serializable {

	@Column(name = "autore")
	private String autore;
	@Column(name = "genere")
	private String genere;

	public Libri() {
		super();
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
