package com.urbs.bgscore.base;

import java.util.HashMap;
import java.util.Map;

import com.urbs.bgscore.games.*;

public class GameManager {
	private Map<String, Game> games;
	
	public GameManager() {
		this.games = new HashMap<String, Game>();
		
		initializeGames();
	}
	
	public Map<String, Game> getGames() {
		return this.games;
	}
	
	protected void initializeGames() {

		Game [] games = new Game[] { new Agricola()};
		
		for(Game g : games)
			getGames().put(g.getName(), g);
	}
	
	
}
