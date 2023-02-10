package progetto;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;

public class MainProject {
	static org.slf4j.Logger log = LoggerFactory.getLogger(MainProject.class);
	static List<CatalogoBiblioteca> cat = new ArrayList();
	static List<CatalogoBiblioteca> catalogo = Arrays.asList(new Libri(001, "Paperino", 2012, 500, "Walt Disney", "Fantasy"),
			new Libri(002, "Topolino", 2013, 500, "Walt Disney", "Fantasy"),
			new Riviste(071, "Pippo", 2017, 500, PeriodoStampa.MENSILE),
			new Libri(003, "Minnie", 2016, 500, "Walt Disney", "Fantasy"),
			new Riviste(072, "Gamba Di Legno", 2016, 500, PeriodoStampa.SEMESTRALE),
			new Riviste(073, "Paperina", 2019, 500, PeriodoStampa.SETTIMANALE));

	public static void main(String[] args) {

		log.info("Test Logger");
		Libri a = new Libri(005, "The Mist", 2022, 500, "Stephen King", "Horror");
		Libri b = new Libri(006, "It", 2022, 500, "Stephen King", "Horror");
		cat.add(a);
		cat.add(b);
		System.out.println(cat.size());
		removeIsbn(005);
		System.out.println(cat.size());

		List<CatalogoBiblioteca> cFiltrati = searchById(catalogo, 001);
		cFiltrati.forEach(ele -> log.info("Elemento rilevato dal catalogo tramire codice ISBN: " + ele));

		File file = new File("dirFile/test.txt");
		String testo = cFiltrati.toString();
		try {
			FileUtils.writeStringToFile(file, testo, "UTF-8", true);
			System.out.println("Testo inserito nel file");
		} catch (IOException e) {
			log.info("Errore");
		}
	}

	public static void addLibro(int isbn, String titolo, int anno, int pagine, String autore, String genere) {
		Libri a = new Libri(isbn, titolo, anno, pagine, autore, genere);
		cat.add(a);

	}

	public static void addRiviste(int isbn, String titolo, int anno, int pagine, PeriodoStampa x) {
		Riviste a = new Riviste(isbn, titolo, anno, pagine, x);
		cat.add(a);

	}

	public static void removeIsbn(int c) {
		cat.removeIf(ele -> ele.getCodiceIsbn() == c);
	}

	public static List<CatalogoBiblioteca> searchById(List<CatalogoBiblioteca> list, int a) {

		return list.stream().filter(e -> e.getCodiceIsbn() == a).collect(Collectors.toList());

	}

	public static List<CatalogoBiblioteca> searchByYears(List<CatalogoBiblioteca> list, int a) {
		
		return list.stream().filter(e -> e.getAnnoPublicazione() == a).collect(Collectors.toList());
		
	}
}
