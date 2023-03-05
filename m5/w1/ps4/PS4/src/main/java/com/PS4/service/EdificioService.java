package com.PS4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS4.model.Edificio;
import com.PS4.repository.EdificioDaoRepository;

@Service
public class EdificioService {

	@Autowired
	EdificioDaoRepository edificioService;

	public Edificio getEdificioByID(Long id) {	
		return edificioService.findById(id).get();
	}
	
	public void updateEdificio(Edificio edificio) {
		edificioService.save(edificio);
	}
	
	public void removeEdificio(Edificio edificio) {
		edificioService.delete(edificio);
	}

}