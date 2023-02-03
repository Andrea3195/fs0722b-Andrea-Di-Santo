package progetto.settimanale;

public class Immagine extends ElementoMultimediale {
	int luminosità;

	public Immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}

	public int abbassaLuminosità() {
		return luminosità--;
	}

	public int alzaLuminosità() {
		return luminosità++;
	}

	public void show() {

		int y = 0;
		while (y < luminosità) {
			System.out.print(" " + titolo);
			y++;
		}

		int z = 0;
		while (z < luminosità) {
			System.out.print(" *");
			z++;
			
		}
	}
}
