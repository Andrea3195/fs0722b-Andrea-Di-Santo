package com.PS4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS4.model.Postazione;
import com.PS4.repository.PostazioneDaoRepository;

@Service
public class PostazioneService {

	@Autowired
	PostazioneDaoRepository postazioneService;

	public Postazione getPostazioneByID(Long id) {	
		return postazioneService.findById(id).get();
	}
	
	public void updatePostazione(Postazione pos) {
		postazioneService.save(pos);
	}
	
	public void removePostazione(Postazione pos) {
		postazioneService.delete(pos);
	}
	
}