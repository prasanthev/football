package com.fifa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fifa.entity.DomesticLeagueEntity;

public interface DomesticLeagueRepository extends CrudRepository<DomesticLeagueEntity, Integer> {
	
	@Query(value = "SELECT * FROM domestic_league WHERE player_name=?1 ", nativeQuery = true)
	DomesticLeagueEntity getPlayerByName(String playerName);
}