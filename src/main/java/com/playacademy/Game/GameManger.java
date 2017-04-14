package com.playacademy.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class GameManger {
	@RequestMapping("/game/create")
	public Question createGame(String name, String courseID, MCQ mcq){
		
		
		return mcq;
		
	}
}
