package com.PS6.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CentroControllo implements Observer {

	private Map<Integer, Sonda> sonde;
	private Comunicazione communication;

	private static CentroControllo instance;

	public CentroControllo(Comunicazione communication) {
		this.sonde = new HashMap<>();
		this.communication = communication;
	}

	public static CentroControllo getInstance(Comunicazione communication) {
		if (instance == null) {
			instance = new CentroControllo(communication);
		}
		return instance;
	}

	public void addSonda(Sonda sonda) {
		sonde.put(sonda.getIdSonda(), sonda);
		sonda.addObserver(this);
		if (communication != null) {
			sonda.setComunicazione(communication);
		}
	}

	public void removeSonda(Sonda sonda) {
		sonde.remove(sonda.getIdSonda());
		sonda.deleteObserver(this);
	}

	public void sendAllarme(int idSonda, double latitude, double longitude, double smokeLevel) {
		String messaggio = "ALLARME!!! La sonda numero " + idSonda + " ha rilevato un livello di fumo di: " + smokeLevel;
		communication.inviaMessaggio(messaggio);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Sonda) {
			Sonda sonda = (Sonda) o;
			System.out.println(
					"La sonda numero " + sonda.getIdSonda() + " ha un nuovo livello di fumo: " + sonda.getSmokeLevel());
			sendAllarme(sonda.getIdSonda(), sonda.getLatitude(), sonda.getLongitude(), sonda.getSmokeLevel());
		}
	}

}