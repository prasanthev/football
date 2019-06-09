package com.fifa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fifa.entity.DomesticLeagueEntity;
import com.fifa.service.AdminService;

@RestController
@RequestMapping("/players")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping(path = "/add", consumes = {"application/json"})
	public String addPlayer(@RequestBody DomesticLeagueEntity domesticLeagueEntity) {
	  return adminService.addPlayer(domesticLeagueEntity);
	}
	@GetMapping(path = "/player/{playerId}")
	public DomesticLeagueEntity getPlayer (@PathVariable int playerId) {
		return adminService.getPlayer(playerId);
	}
	@DeleteMapping(path = "/player/{playerId}")
	public String deletePlayer(@PathVariable int playerId) {
		return adminService.deletePlayer(playerId);
	}
	@GetMapping(path = "/all")
	@ResponseBody
	public Iterable<DomesticLeagueEntity> getPlayers(){
		return adminService.getPlayers();
	}
	@GetMapping(path = "/name/{playerName}")
	public DomesticLeagueEntity getPlayerDetailsByName(@PathVariable String playerName) {
		return adminService.getPlayerDetailsByName(playerName);
	}
	@PutMapping(path = "/update/goals/{playerId}/{goals}")
	public String updateGoals(@PathVariable int playerId,@PathVariable int goals) {
		return adminService.updateGoals(playerId, goals);
	}
	@PutMapping(path="/update/assists/{playerId}/{assists}", consumes= {"application/json"})
	public String updateAssists(@PathVariable int playerId,@PathVariable int assists) {
		return adminService.updateAssists(playerId, assists);
	}

}
