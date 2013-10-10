package com.urbs.bgscore.base;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
	private String name;
	private List<Gamer> gamers;
	
	public Game(String name) {
		this.name = name;
		this.gamers = new ArrayList<Gamer>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Gamer> getGamers(){
		return this.gamers;
	}
	
	public void Populate() {
		for(Gamer g : gamers) {
			populateGamer(g);
		}
	}
	
	protected abstract void populateGamer(Gamer g);
}
