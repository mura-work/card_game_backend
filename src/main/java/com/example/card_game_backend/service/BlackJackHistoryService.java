package com.example.card_game_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.card_game_backend.entity.BlackJackHistory;
import com.example.card_game_backend.form.BlackJackHistoryForm;
import com.example.card_game_backend.repository.BlackJackHistoryRepository;

@Service
public class BlackJackHistoryService {
	@Autowired
	BlackJackHistoryRepository repository;

	public List<BlackJackHistory> findAll() {
		return repository.findAll();
	}

	public void saveTest(BlackJackHistoryForm testForm) {
		BlackJackHistory test = new BlackJackHistory();
		test.setUserId(testForm.getUserId());
		test.setPlayingDateTime(testForm.getPlayingDateTime());
		test.setResult(testForm.getResult());
		repository.save(test);
	}
}
