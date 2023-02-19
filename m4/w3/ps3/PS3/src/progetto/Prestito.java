package progetto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "prestito1")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TipoPrestito", discriminatorType = DiscriminatorType.STRING)

public class Prestito implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String utente;
	private int elementoPrestato;
	private LocalDate inizioPrestito;
	private LocalDate restituzionePrevista;
	private LocalDate restituzioneEffettiva;

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public int getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(int elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public LocalDate getRestituzionePrevista() {
		return restituzionePrevista;
	}

	public void setRestituzionePrevista(LocalDate restituzionePrevista) {
		this.restituzionePrevista = restituzionePrevista;
	}

	public LocalDate getRestituzioneEffettiva() {
		return restituzioneEffettiva;
	}

	public void setRestituzioneEffettiva(LocalDate restituzioneEffettiva) {
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

	public Prestito() {
		super();
	}

}
