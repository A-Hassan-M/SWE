package com.playacademy.Game;

import javax.persistence.Entity;

@Entity
public class MCQ extends Question {
	
	private String question;
	private String answer;
	private String[] choices;
	
	
	public MCQ(Long id){
		this.setGameID(id);
	}
	// Setters
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	
	// Getters
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public String[] getChoices() {
		return choices;
	}
	
	
	
	
}
