package com.PS4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS4.model.Prenotazione;
import com.PS4.repository.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneDaoRepository prenotazioneService;

	public Prenotazione getPrenotazioneByID(Long id) {
		return prenotazioneService.findById(id).get();
	}

	public void updatePrenotazione(Prenotazione p) {
		prenotazioneService.save(p);
	}

	public void removePrenotazione(Prenotazione p) {
		prenotazioneService.delete(p);
	}
	
}