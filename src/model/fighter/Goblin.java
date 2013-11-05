package model.fighter;

import model.board.Board;
import model.board.Content;
import model.element.MoveListener;
import model.fighter.level.LevelEnemies;

public class Goblin extends FighterEnemy implements Content, MoveListener{
	private final double SALUD = 1;
	private final double FUERZA = 0.7;
	private int movements = 0;

	public Goblin(LevelEnemies aLevel) {
		super(aLevel);
		//listener
		// asi cada vez que agrego un goblin en levelX, se agrega un listener
	}
	
	@Override
	public int getStrength() {
		return (int) Math.floor(super.getStrength()*FUERZA);
	}
	@Override
	public int getMaxHealth() {
		return (int)Math.floor(super.getMaxHealth()*SALUD);
	}

	@Override
	public void heroMoves() {
		movements++;
		if (movements % 2 == 0) {
			heal(1);
		}
	}
	
}
