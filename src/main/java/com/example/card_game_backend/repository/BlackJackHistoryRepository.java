package com.example.card_game_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.card_game_backend.entity.BlackJackHistory;

public interface BlackJackHistoryRepository extends JpaRepository<BlackJackHistory, Integer> {

}
