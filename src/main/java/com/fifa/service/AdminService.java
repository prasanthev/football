package com.fifa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifa.entity.DomesticLeagueEntity;
import com.fifa.repository.DomesticLeagueRepository;

@Service
public class AdminService {
	
	@Autowired
	DomesticLeagueRepository domesticLeagueRepository;
	
	public String addPlayer(DomesticLeagueEntity domesticLeagueEntity ) {
		domesticLeagueRepository.save(domesticLeagueEntity);
		return "Player added successfully";
	}
	public DomesticLeagueEntity getPlayer(int playerId) {
		return domesticLeagueRepository.findById(playerId).get();
	}
	public String deletePlayer(int playerId) {
		domesticLeagueRepository.deleteById(playerId);
		return "Player deleted successfully";
	}
	public Iterable<DomesticLeagueEntity> getPlayers() {
		return domesticLeagueRepository.findAll();	
	}
	public DomesticLeagueEntity getPlayerDetailsByName(String playerName) {
		return domesticLeagueRepository.getPlayerByName(playerName);
	}
	public String updateGoals(int playerId, int goals) {
		DomesticLeagueEntity updatedDomesticLeagueEntity = domesticLeagueRepository.findById(playerId).get();
		updatedDomesticLeagueEntity.setGoals(goals);
		domesticLeagueRepository.save(updatedDomesticLeagueEntity);
		return "goals updated successfully";
	}
	public String updateAssists(int playerId, int assists) {
		DomesticLeagueEntity updatedDomesticLeagueEntity = domesticLeagueRepository.findById(playerId).get();
		updatedDomesticLeagueEntity.setAssists(assists);
		domesticLeagueRepository.save(updatedDomesticLeagueEntity);
		return "Assists updated successfully";
		
	}
}
