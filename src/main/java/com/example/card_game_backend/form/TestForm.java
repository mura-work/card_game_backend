package com.example.card_game_backend.form;

import java.time.LocalDate;
import java.util.Map;

public class TestForm {
	private Long userId;
	private LocalDate playingDateTime;
	private Map<String, String> playerHands;
	private Map<String, String> dealerHands;
	private String result;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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
