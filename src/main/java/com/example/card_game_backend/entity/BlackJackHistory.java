package com.example.card_game_backend.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name = "black_jack_histories")
public class BlackJackHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Long userId;

	@Column
	private LocalDate playingDateTime;

	@Column
	private String result;

	@OneToOne(mappedBy = "blackJackHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("blackJackHistory")
	private PlayerBlackJackHands playerBlackJackHands;

	@OneToOne(mappedBy = "blackJackHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("blackJackHistory")
	private DealerBlackJackHands dealerBlackJackHands;
}
