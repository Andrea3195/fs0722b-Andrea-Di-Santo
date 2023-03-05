package com.PS4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PS4.model.Postazione;
import com.PS4.model.TipoPostazione;

@Repository
public interface PostazioneDaoRepository extends JpaRepository<Postazione, Long> {

	public List<Postazione> findByTipo(TipoPostazione tipo);

	public List<Postazione> findByEdificio(String citta);

}