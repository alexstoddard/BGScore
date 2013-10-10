package com.urbs.bgscore.base;

import java.util.HashMap;
import java.util.Map;

public class Gamer {
	
	private Game game;
	private String name;
	private Map<String, Scorable> scorables;
	
	public Gamer(Game game, String name) {
		this.game = game;
		this.name = name;
		this.scorables = new HashMap<String, Scorable>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Game getGame() {
		return this.game;
	}
	
	public Map<String, Scorable> getScorables() {
		return scorables;
	}
	
	public int getScore() {
		int score = 0;
		
		for(Scorable s : scorables.values()) {
			score += s.toPoints();
		}
		
		return score;
	}
}
