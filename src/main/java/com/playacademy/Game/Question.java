package com.playacademy.Game;

import javax.persistence.*;

@Entity
@Inheritance
@DiscriminatorColumn(name = "question_type")
@Table(name = "questions")
public abstract class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long gameID;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="gameId")
//    private Game game;
	
	//Setters
	public void setGameID(long gameID) {
		this.gameID = gameID;
	}
//	public void setGame(Game game) {
//		this.game = game;
//	}
	
	// Getters
	public long getGameID() {
		return gameID;
	}
//	public Game getGame() {
//		return game;
//	}

	
}
