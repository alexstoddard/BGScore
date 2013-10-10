package com.urbs.bgscore.base;

public abstract class Scorable {
	
	private String description;
	private Gamer gamer;

	private int value;
	private int min;
	private int max;
	
	public Scorable(Gamer gamer, String description, 
					int value, int min, int max) {
		this.min = min;
		this.max = max;
		this.value = value;
		this.gamer = gamer;
		this.description = description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	protected Gamer getGamer() {
		return gamer;
	}
	
	public void setScorable(int value) {
		this.value = value;
	}

	public int getScorable() {
		return value;
	}	
	
	public int getMin() {
		return this.min;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public abstract int toPoints();
}
