package com.example.card_game_backend.form;

import java.time.LocalDate;

import com.example.card_game_backend.entity.DealerBlackJackHands;
import com.example.card_game_backend.entity.PlayerBlackJackHands;

public class BlackJackHistoryForm {
	private Long userId;
	private LocalDate playingDateTime;
	private PlayerBlackJackHands playerHands;
	private DealerBlackJackHands dealerHands;
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
	public PlayerBlackJackHands getPlayerHands() {
		return playerHands;
	}

	public void setPlayerHands(PlayerBlackJackHands playerHands) {
		this.playerHands = playerHands;
	}
	public DealerBlackJackHands getDealerHands() {
		return dealerHands;
	}

	public void setDealerHands(DealerBlackJackHands dealerHands) {
		this.dealerHands = dealerHands;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
