package com.PS4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PS4.model.Edificio;

@Repository
public interface EdificioDaoRepository extends JpaRepository<Edificio, Long> {

}