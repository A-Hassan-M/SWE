package com.playacademy.Game;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "games")
public class Game {
			
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long gameId;
	  
	// The game name
	@NotNull
	private String name;
	
	
//	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="games")
//    private List<Question> questions;
	
	// Setters
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters
	
	public String getName() {
		return name;
	}
	public long getGameId() {
		return gameId;
	}
//	public List<Question> getQuestions() {
//		return questions;
//	}
	
	
	
  
}
