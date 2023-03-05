package com.PS4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PS4.model.Utente;

@Repository
public interface UtenteDaoRepository extends JpaRepository<Utente, Long> {

}