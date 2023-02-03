package progetto.settimanale;

public class Video extends ElementoMultimediale {
	int durata;
	int volume;
	int luminosità;

	public Video(String titolo, int durata, int volume, int luminosità) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosità = luminosità;
	}

	public int abbassaLuminosità() {
		return luminosità--;
	}

	public int alzaLuminosità() {
		return luminosità++;
	}

	public void light() {
		
		int x = 0;
		while (x < luminosità) {
			System.out.print(" *");
			x++;

		}
	}
}
