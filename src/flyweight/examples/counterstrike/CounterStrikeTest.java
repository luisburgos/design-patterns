package flyweight.examples.counterstrike;

import java.util.Random;

public class CounterStrikeTest {
	
	private static String[] playerType = {"Terrorist", "CounterTerrorist"}; 
	private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"}; 

	public static void main(String args[]) { 
		for (int i = 0; i < 10; i++) { 
			Player p = PlayerFactory.getPlayer(getRandPlayerType()); 
			p.assignWeapon(getRandWeapon()); 
			p.mission(); 
		} 
	} 
	
	// Utility methods to get a random player type and weapon 
	public static String getRandPlayerType() { 
		Random r = new Random(); 
		int randInt = r.nextInt(playerType.length); 

		return playerType[randInt]; 
	} 
	
	public static String getRandWeapon() { 
		Random r = new Random(); 
		int randInt = r.nextInt(weapons.length); 
		
		return weapons[randInt]; 
	} 
}
