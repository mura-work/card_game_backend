package com.example.card_game_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.card_game_backend.entity.Test;
import com.example.card_game_backend.form.TestForm;
import com.example.card_game_backend.repository.TestRepository;

@Service
public class TestService {
	@Autowired
	TestRepository repository;

	public void saveTest(TestForm testForm) {
		Test test = new Test();
		test.setDealerHands(null);
		test.setUserId(testForm.getUserId());
		test.setPlayerHands(null);
		test.setPlayingDateTime(testForm.getPlayingDateTime());
		test.setResult(testForm.getResult());
		repository.save(test);
	}
}
