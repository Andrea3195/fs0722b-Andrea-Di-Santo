package progetto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.catalog.Catalog;

public class MainProject {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PS3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		Utente u = new Utente();
		u.setNome("Mario");
		u.setCognome("Biondi");
		u.setDataNascita(LocalDate.now());
		addUtente(u);

		Prestito p = new Prestito();
		p.setElementoPrestato(0);
		p.setInizioPrestito(LocalDate.now());
		p.setRestituzionePrevista(LocalDate.now());
		p.setRestituzioneEffettiva(LocalDate.now());
		addPrestito(p);

		Riviste r1 = new Riviste();
		r1.setTitolo("Frigidaire");
		r1.setPeriodicita(Periodicita.MENSILE);

		Riviste r2 = new Riviste();
		r2.setTitolo("Garo");
		r2.setPeriodicita(Periodicita.MENSILE);

		Riviste r3 = new Riviste();
		r3.setTitolo("Focus");
		r3.setPeriodicita(Periodicita.SETTIMANALE);

		Libri l1 = new Libri();
		l1.setTitolo("Dune");
		l1.setAutore("Frank Herbert");
		l1.setGenere("Fantascienza");
		l1.setAnnoPubblicazione(1965);

		Libri l2 = new Libri();
		l2.setTitolo("It");
		l2.setAutore("Stephen King");
		l2.setGenere("Fantasy");
		l2.setAnnoPubblicazione(1986);

		Libri l3 = new Libri();
		l3.setTitolo("Il Signore degli Anelli");
		l3.setAutore("J.R.R Tolkien");
		l3.setGenere("Fantasy");
		l3.setAnnoPubblicazione(1955);

	}

	private static void addUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto al database");
	}

	private static void addPrestito(Prestito p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Prestito aggiunto al database");
	}

	private static void addCatalogo1(Catalogo l1) {
		em.getTransaction().begin();
		em.persist(l1);
		em.getTransaction().commit();
		System.out.println("Elemento del catalogo aggiunto al database");
	}
	
	public static void searchISBN(Integer id) {
		em.getTransaction().begin();
		Catalogo c = em.find(Catalogo.class, id);
		em.getTransaction().commit();
		System.out.println("Elemento trovato attraverso l'Id" + c);

	}

	private static void remove(Integer id) {
		em.getTransaction().begin();
		Libri l = em.find(Libri.class, id);
		em.remove(l);
		em.getTransaction().commit();
		System.out.println("Elemento rimosso attraverso l'ISBN");
	}

	public static void readDato(String autore) {
		try {
			Query querySelect = em.createQuery("SELECT autore FROM Catologo autore");
			List<Catalogo> resultList = querySelect.getResultList();
			em.getTransaction().begin();

			Query queryUpdate = em.createQuery("UPDATE Catalogo Libri SET titolo = :titolo WHERE Libri.titolo =:titolo");
			queryUpdate.setParameter("titolo", "Dune");
			int numeroEntitaAggiornate = queryUpdate.executeUpdate();

		} finally {
			em.close();
		}

	}

}
