package com.playacademy.Game;

import javax.persistence.Entity;

@Entity
public class TrueAndFalse extends Question {
	
	private String question;
	private String answer;
	
	
	public TrueAndFalse(Long id){
		this.setGameID(id);
	}
	// Setters
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//Getters
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	
	
	
	
}
