package com.playacademy.Game;

import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Match extends Question{
		
	private String[] leftChoices;
	private String[] rightChoices;
	private Map<String, String> answers;
	
	public Match(Long id){
		this.setGameID(id);
	}
	
	// Setters
	public void setLeftChoices(String[] leftChoices) {
		this.leftChoices = leftChoices;
	}
	public void setRightChoices(String[] rightChoices) {
		this.rightChoices = rightChoices;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	// Getters
	public String[] getLeftChoices() {
		return leftChoices;
	}
	public String[] getRightChoices() {
		return rightChoices;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	
	
	
}
