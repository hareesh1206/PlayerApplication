package com.game.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.demo.domain.Player;
import com.game.demo.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public Player getPlayer(Long id) {
		return playerRepository.findById(id).get();
	}
	
	@Override
	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}
	
	@Override
	public Player updatePlayer(Player player) {
		return playerRepository.save(player);
	}
	
	@Override
	public void deletePlayer(Long id) {
		playerRepository.deleteById(id);
	}
	
	@Override
	public List<Player> listPlayers(){
		return playerRepository.findAll();
	}

}
