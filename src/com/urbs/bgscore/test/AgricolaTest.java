package com.urbs.bgscore.test;

import org.junit.Test;

import com.urbs.bgscore.base.Game;
import com.urbs.bgscore.base.GameManager;
import com.urbs.bgscore.base.Gamer;

import junit.framework.TestCase;

public class AgricolaTest extends TestCase {
	
	@Test
	public void testSoloUser() {
		GameManager manager = new GameManager();
		Game agricola = manager.getGames().get("Agricola");

		Gamer alex = new Gamer(agricola, "Alex");
		
		agricola.getGamers().add(alex);
		agricola.Populate();
		
		alex.getScorables().get("Fields").setScorable(2);
		alex.getScorables().get("Pastures").setScorable(1);
		alex.getScorables().get("Grain").setScorable(1);
		alex.getScorables().get("Vegetables").setScorable(1);
		alex.getScorables().get("Sheep").setScorable(1);
		alex.getScorables().get("Wild boar").setScorable(1);
		alex.getScorables().get("Cattle").setScorable(1);
		alex.getScorables().get("Unused Spaces").setScorable(1);
		alex.getScorables().get("Fenced Stables").setScorable(1);
		alex.getScorables().get("Clay Hut Rooms").setScorable(0);
		alex.getScorables().get("Stone House Rooms").setScorable(3);
		alex.getScorables().get("Family Members").setScorable(3);

		assertEquals(22, alex.getScore());
	}
}	
