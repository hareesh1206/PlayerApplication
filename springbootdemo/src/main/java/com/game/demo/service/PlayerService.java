package com.game.demo.service;

import java.util.List;

import com.game.demo.domain.Player;

public interface PlayerService {
	
	Player getPlayer(Long id);
	
	Player savePlayer(Player player);
	
	Player updatePlayer(Player player);
	
	void deletePlayer(Long id);
	
	List<Player> listPlayers();
}
