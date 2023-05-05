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
import lombok.Data;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name = "black_jack_history")
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

	// public Long getId() {
	// 	return id;
	// }

	// public void setId(Long id) {
	// 	this.id = id;
	// }

	// public Long getUserId() {
	// 	return userId;
	// }

	// public void setUserId(Long userId) {
	// 	this.userId = userId;
	// }

	// public LocalDate getPlayingDateTime() {
	// 	return playingDateTime;
	// }

	// public void setPlayingDateTime(LocalDate playingDateTime) {
	// 	this.playingDateTime = playingDateTime;
	// }

	// public String getResult() {
	// 	return result;
	// }

	// public void setResult(String result) {
	// 	this.result = result;
	// }
}
