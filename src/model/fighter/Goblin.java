package model.fighter;

import model.board.Content;
import model.fighter.level.LevelEnemies;

public class Goblin extends FighterEnemy implements Content{
	private final double SALUD = 1;
	private final double FUERZA = 0.7;

	public Goblin(LevelEnemies aLevel) {
		super(aLevel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getStrength() {
		return (int) Math.floor(super.getStrength()*FUERZA);
	}
	@Override
	public int getMaxHealth() {
		return (int)Math.floor(super.getMaxHealth()*SALUD);
	}
	
}
