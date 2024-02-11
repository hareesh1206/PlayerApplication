package com.game.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.demo.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
