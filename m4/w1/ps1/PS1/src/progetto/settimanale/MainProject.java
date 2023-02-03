package progetto.settimanale;

import java.util.Scanner;

import progetto.settimanale.ElementoMultimediale;
import progetto.settimanale.Immagine;
import progetto.settimanale.RegistrazioneAudio;
import progetto.settimanale.Video;

public class MainProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Titolo: ");
		String titolo = sc.nextLine();
		System.out.println("Volume: ");
		int volume = sc.nextInt();
		System.out.println("Durata: ");
		int durata = sc.nextInt();
		System.out.println("Luminosità: ");
		int luminosità = sc.nextInt();

		System.out.println("Quale elemento vuoi eseguire?");
		int lettoreMultimediale = sc.nextInt();

		RegistrazioneAudio Audio = new RegistrazioneAudio(titolo, volume, durata);
		Audio.play();

		Video VideoX = new Video(titolo, durata, volume, luminosità);
		VideoX.light();

		Immagine ImmagineY = new Immagine(titolo, luminosità);
		ImmagineY.show();

		ElementoMultimediale[] elemento = new ElementoMultimediale[5];
		elemento[0] = ImmagineY;
		elemento[1] = VideoX;
		elemento[2] = Audio;
		elemento[3] = ImmagineY;
		elemento[4] = VideoX;

	}
}
