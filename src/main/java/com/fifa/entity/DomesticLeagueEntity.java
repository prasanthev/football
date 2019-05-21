package com.fifa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fifa.PlayerPositions;

@Entity
@Table(name = "domestic_league")
public class DomesticLeagueEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "player_id")
	private int playerId;
	@Column(name = "player_name")
	private String playerName;
	@Column(name = "shirt_number")
	private int shirtNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "player_position")
	private PlayerPositions playerPosition;
	
	@Column(name = "goals")
	private int goals;
	@Column(name = "assists")
	private int assists;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public PlayerPositions getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(PlayerPositions playerPosition) {
		this.playerPosition = playerPosition;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	@Override
	public String toString() {
		return "DomesticLeagueEntity [playerId=" + playerId + ", playerName=" + playerName + ", shirtNumber="
				+ shirtNumber + ", playerPosition=" + playerPosition + ", goals=" + goals + ", assists=" + assists
				+ "]";
	}
}
