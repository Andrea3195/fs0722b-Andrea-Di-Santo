package com.PS4.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn (name = "id_utente")
	private Utente utente;

	@ManyToOne
	@JoinColumn (name = "id_postazione")
	private Postazione postazione;
	
	private LocalDate date;

}