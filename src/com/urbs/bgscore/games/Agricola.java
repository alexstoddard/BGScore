package com.urbs.bgscore.games;

import java.util.Map;

import com.urbs.bgscore.base.Game;
import com.urbs.bgscore.base.Gamer;
import com.urbs.bgscore.base.Scorable;

public class Agricola extends Game {
	
	public Agricola() {
		super("Agricola");
	}
	
	protected void populateGamer(Gamer g) {
		
		Map<String, Scorable> map  = g.getScorables();
		Scorable s;
		
		s = new Scorable(g, "Fields", 0, 0, 5) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 1) {
					return -1;
				} else if (v <= 4) {
					return v-1;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);
		
		s = new Scorable(g, "Pastures", 0, 0, 4) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v <= 4) {
					return v;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Grain", 0, 0, 8) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v >= 1 && v <= 3) {
					return 1;
				} else if (v >= 4 && v <= 5) {
					return 2;
				} else if (v >= 6 && v <= 7) {
					return 3;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Vegetables", 0, 0, 4) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v <= 4) {
					return v;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Sheep", 0, 0 , 8) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v >= 1 && v <= 3) {
					return 1;
				} else if (v >= 4 && v <= 5) {
					return 2;
				} else if (v >= 6 && v <= 7) {
					return 3;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Wild boar", 0, 0, 7) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v >= 1 && v <= 2) {
					return 1;
				} else if (v >= 3 && v <= 4) {
					return 2;
				} else if (v >= 5 && v <= 6) {
					return 3;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Cattle", 0, 0, 6) {
			@Override
			public int toPoints() {
				int v = getScorable();
				if(v <= 0) {
					return -1;
				} else if (v == 1) {
					return 1;
				} else if (v >= 2 && v <= 3) {
					return 2;
				} else if (v >= 4 && v <= 5) {
					return 3;
				} else {
					return 4;
				}
			}
		};
		map.put(s.getDescription(), s);
		
		s = new Scorable(g, "Unused Spaces", 13, 0, 13) {
			@Override
			public int toPoints() {
				int v = getScorable();
				return -v;
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Fenced Stables", 0, 0, 5) {
			@Override
			public int toPoints() {
				int v = getScorable();
				return v;
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Clay Hut Rooms", 0, 0, 15) {
			@Override
			public int toPoints() {
				int v = getScorable();
				return v;
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Stone House Rooms", 0, 0, 15) {
			@Override
			public int toPoints() {
				int v = getScorable();
				return v*2;
			}
		};
		map.put(s.getDescription(), s);

		s = new Scorable(g, "Family Members", 2, 2, 5) {
			@Override
			public int toPoints() {
				int v = getScorable();
				return v*3;
			}
		};
		map.put(s.getDescription(), s);
	}
}
