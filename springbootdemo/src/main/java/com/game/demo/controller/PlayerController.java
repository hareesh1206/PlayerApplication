package com.game.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.game.demo.domain.Player;
import com.game.demo.service.PlayerService;

@Controller
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@GetMapping("/find/player/{id}")
	public String getPlayer(@PathVariable Integer id, Model model) {

		Player player = playerService.getPlayer(Long.valueOf(id));
		
		String msg = player.getName()+" with id "+player.getId()+" has high score of "+player.getHighscore();
		
		model.addAttribute("player",player);
		model.addAttribute("msg",msg);
		
	//	return "homepage";
		return player.getName()+" with id "+player.getId()+" has high score of "+player.getHighscore();
	}

	@GetMapping("/test")
	public String test(Model model) {

		Player player = playerService.getPlayer(Long.valueOf(1));
		
		String msg = player.getName()+" with id "+player.getId()+" has high score of "+player.getHighscore();
		
		model.addAttribute("player",player);
		model.addAttribute("msg",msg);
		
		return "homepage";
	//	return player.getName()+" with id "+player.getId()+" has high score of "+player.getHighscore();
	}
	
	@PostMapping("/save/player")
	public Player savePlayer(@RequestBody Player player) {

		return playerService.savePlayer(player);
	}

	@PutMapping("/update/player")
	public Player updatePlayer(@RequestBody Player player) {

		return playerService.updatePlayer(player);
	}

	@DeleteMapping("/delete/player/{id}")
	public void deletePlayer(Integer id) {
		playerService.deletePlayer(Long.valueOf(id));
	}
	
	@GetMapping(path = "/find/players")
	public List<Player> getAllPlayers(){
		
		return playerService.listPlayers();
	}

}
