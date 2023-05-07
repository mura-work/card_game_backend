package com.example.card_game_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.card_game_backend.entity.BlackJackHistory;
import com.example.card_game_backend.entity.DealerBlackJackHands;
import com.example.card_game_backend.entity.PlayerBlackJackHands;
import com.example.card_game_backend.form.BlackJackHistoryForm;
import com.example.card_game_backend.repository.BlackJackHistoryRepository;
import com.example.card_game_backend.repository.DealerBlackJackHandsRepository;
import com.example.card_game_backend.repository.PlayerBlackJackHandsRepository;

import jakarta.transaction.Transactional;

@Service
public class BlackJackHistoryService {
	@Autowired
	BlackJackHistoryRepository repository;

	@Autowired
	PlayerBlackJackHandsRepository playerHandsRepository;

	@Autowired
	DealerBlackJackHandsRepository dealerHandsRepository;

	public List<BlackJackHistory> findAll() {
		return repository.findAll();
	}

	@Transactional
	public void saveTest(BlackJackHistoryForm testForm) {
		BlackJackHistory blackJackHistory = new BlackJackHistory();
		blackJackHistory.setUserId(testForm.getUserId());
		blackJackHistory.setPlayingDateTime(testForm.getPlayingDateTime());
		blackJackHistory.setResult(testForm.getResult());
		blackJackHistory.setPlayerHands(testForm.getPlayerHands());
		blackJackHistory.setDealerHands(testForm.getDealerHands());
		BlackJackHistory blackJackHistoryEntity = repository.save(blackJackHistory);

		PlayerBlackJackHands playerHands = testForm.getPlayerHands();
		playerHands.setBlackJackHistory(blackJackHistoryEntity);
		playerHandsRepository.save(playerHands);

		DealerBlackJackHands dealerHands = testForm.getDealerHands();
		dealerHands.setBlackJackHistory(blackJackHistoryEntity);
		dealerHandsRepository.save(dealerHands);
	}
}
