package com.example.card_game_backend.form;

import java.time.LocalDate;
import java.util.List;

import com.example.card_game_backend.entity.DealerBlackJackHands;
import com.example.card_game_backend.entity.PlayerBlackJackHands;

public class BlackJackHistoryForm {
	private Long userId;
	private LocalDate playingDateTime;
	private	List<PlayerBlackJackHands> playerHands;
	private List<DealerBlackJackHands> dealerHands;
	private String result;
	private int totalPoint;
	private int pointDifference;

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
	public List<PlayerBlackJackHands>  getPlayerHands() {
		return playerHands;
	}

	public void setPlayerHands(List<PlayerBlackJackHands>  playerHands) {
		this.playerHands = playerHands;
	}
	public List<DealerBlackJackHands> getDealerHands() {
		return dealerHands;
	}

	public void setDealerHands(List<DealerBlackJackHands> dealerHands) {
		this.dealerHands = dealerHands;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	public int getPointDifference() {
		return pointDifference;
	}

	public void setPointDifference(int pointDifference) {
		this.pointDifference = pointDifference;
	}
}
