package com.example.card_game_backend.entity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Number userId;

	@Column
	private LocalDate playingDateTime;

	@ElementCollection
	private Map<String, String> playerHands = new HashMap<>();

	@ElementCollection
	private Map<String, String> dealerHands = new HashMap<>();

	@Column
	private String result;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Number getUserId() {
		return userId;
	}

	public void setUserId(Number userId) {
		this.userId = userId;
	}

	public LocalDate getPlayingDateTime() {
		return playingDateTime;
	}

	public void setPlayingDateTime(LocalDate playingDateTime) {
		this.playingDateTime = playingDateTime;
	}

	public Map<String, String> getPlayerHands() {
		return playerHands;
	}

	public void setPlayerHands(Map<String, String> playerHands) {
		this.playerHands = playerHands;
	}

	public Map<String, String> getDealerHands() {
		return dealerHands;
	}

	public void setDealerHands(Map<String, String> dealerHands) {
		this.dealerHands = dealerHands;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
