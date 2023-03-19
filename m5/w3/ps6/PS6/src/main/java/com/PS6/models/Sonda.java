package com.PS6.models;

import java.util.Observable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sonda extends Observable {

	private int idSonda;
	private double latitude;
	private double longitude;
	private double smokeLevel;
	private Comunicazione comunicazione;

	public Sonda(int id, double latitude, double longitude, double smokeLevel,
			Comunicazione comunicazione) {
		this.idSonda = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
		this.comunicazione = comunicazione;
	}

	public void setSmokeLevel(double smokeLevel) {
		this.smokeLevel = smokeLevel;

		if (this.smokeLevel > 5) {
			setChanged();
			notifyObservers(this);
			comunicazione.inviaMessaggio("http://host/alarm?=idsonda=" + idSonda + "&lat=" + latitude + "&lon="
					+ longitude + "&smokelevel=" + smokeLevel);
		}
	}
}
