package com.example.card_game_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="player_black_jack_hands")
public class PlayerBlackJackHands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String suit;

	@Column
	private String rank;

	@OneToOne
	@JoinColumn(name = "black_jack_history_id", referencedColumnName = "id", nullable = false)
	private BlackJackHistory blackJackHistory;
}