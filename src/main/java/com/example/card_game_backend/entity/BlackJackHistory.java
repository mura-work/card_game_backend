package com.example.card_game_backend.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

	@Column
	private int totalPoint;

	@Column
	private int pointDifference;

	@OneToMany(mappedBy = "blackJackHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("blackJackHistory")
	private List<PlayerBlackJackHands> playerBlackJackHands;

	@OneToMany(mappedBy = "blackJackHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("blackJackHistory")
	private List<DealerBlackJackHands> dealerBlackJackHands;

	public void setPlayerHands(List<PlayerBlackJackHands> playerHands) {
		this.playerBlackJackHands = playerHands;
	}

	public void setDealerHands(List<DealerBlackJackHands> dealerHands) {
		this.dealerBlackJackHands = dealerHands;
	}
}
