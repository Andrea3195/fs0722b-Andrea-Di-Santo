package com.PS6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.PS6.models.Comunicazione;
import com.PS6.models.CentroControllo;
import com.PS6.models.CanaleComunicazione;
import com.PS6.models.Sonda;

@SpringBootApplication
public class Ps6Application {

	public static void main(String[] args) {
		
		Comunicazione comunicazione = (Comunicazione) new CanaleComunicazione();

        CentroControllo centroControllo = CentroControllo.getInstance(comunicazione);

        Sonda sonda1 = new Sonda(1, 60.38, 5.1947, 0.0, comunicazione);
        Sonda sonda2 = new Sonda(2, 45.73, 7.3682, 0.0, comunicazione);
        centroControllo.addSonda(sonda1);
        centroControllo.addSonda(sonda2);

        sonda1.setSmokeLevel(8.5);

        sonda2.setSmokeLevel(4.0);
        
	}
}
