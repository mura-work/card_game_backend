package com.example.card_game_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.card_game_backend.entity.BlackJackHistory;
import com.example.card_game_backend.form.BlackJackHistoryForm;
import com.example.card_game_backend.service.BlackJackHistoryService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BlackJackHistoriesController {

	@Autowired
	BlackJackHistoryService service;

	@RequestMapping(value = "/black_jack_histories")
	@CrossOrigin
	public List<BlackJackHistory> getBlackJackHistories() {
		List<BlackJackHistory> histories = service.findAll();
		return histories;
	}

	@RequestMapping(value = "/black_jack_histories", method = RequestMethod.POST)
	@CrossOrigin
	public boolean postTest(@RequestBody BlackJackHistoryForm historyForm, BindingResult result) {
		if (result.hasErrors()) {
			return false;
		}
		service.saveTest(historyForm);
		return true;
	}
}
