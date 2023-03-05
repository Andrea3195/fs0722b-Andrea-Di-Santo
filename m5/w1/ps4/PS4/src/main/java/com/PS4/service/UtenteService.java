package com.PS4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS4.model.Utente;
import com.PS4.repository.UtenteDaoRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteDaoRepository utenteService;

	public Utente getUtenteByID(Long id) {
		return utenteService.findById(id).get();
	}

	public void updateUtente(Utente u) {
		utenteService.save(u);
	}

	public void removeUtente(Utente u) {
		utenteService.delete(u);
	}

}