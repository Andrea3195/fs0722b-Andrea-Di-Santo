package progetto.settimanale;

public class RegistrazioneAudio extends ElementoMultimediale {
	int volume;
	int durata;

	public RegistrazioneAudio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}

	public int abbassaVolume() {
		return volume--;
	}

	public int alzaVolume() {
		return volume++;
	}

	public void play() {
		int i = 0;
		while (i < durata) {
			System.out.print(" " + titolo);
			i++;
		}
		int w = 0;
		while (w < volume) {
			System.out.print(" !");
			w++;
			
		}
	}
}
