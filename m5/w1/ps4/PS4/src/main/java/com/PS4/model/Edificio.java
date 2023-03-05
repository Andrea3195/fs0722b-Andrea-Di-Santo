package com.PS4.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String citta;
	private String indirizzo;

	@OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL)
	private List<Postazione> postazioni;

}