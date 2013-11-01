package model.fighter;

import model.board.Content;
import model.fighter.level.LevelEnemies;

public class Golem extends FighterEnemy implements Content {
	private final double SALUD = 1.35; 
	private final double FUERZA = 1;
	
	public Golem(LevelEnemies aLevel) {
		super(aLevel);
		// TODO Auto-generated constructor stub
	}
}
