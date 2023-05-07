package com.example.card_game_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.card_game_backend.entity.PlayerBlackJackHands;

public interface PlayerBlackJackHandsRepository extends JpaRepository<PlayerBlackJackHands, Integer> {

}
