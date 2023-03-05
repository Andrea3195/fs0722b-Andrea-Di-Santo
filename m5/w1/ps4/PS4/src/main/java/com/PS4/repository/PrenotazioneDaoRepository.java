package com.PS4.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PS4.model.Postazione;
import com.PS4.model.Prenotazione;

@Repository
public interface PrenotazioneDaoRepository extends JpaRepository<Prenotazione, Long> {

	public List<Prenotazione> findByPostazione(Postazione postazione);
}