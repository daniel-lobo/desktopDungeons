package model.fighter;

import model.fighter.level.Level;
import model.fighter.level.LevelHero;
import model.board.Content;

public class FighterHero implements Fighter {
	private int health = 10; // predetermined
	private int strength = 5; // predetermined
	private LevelHero level = new LevelHero(); // 1 es nivel en el que arranca, 20 es maxLevel
	private int experience;
	
	public FighterHero(){
		
	}
	@Override
	public boolean canWalkOver() {
		return false;
	}

	@Override
	public boolean isAlive() {
		return health == 0;
	}
	@Override
	public void injured(final int value) {
		if ((health -= value) <= 0) {
			health = 0;
		}
	}
	@Override
	public void heal(final int value) {
		if ((health += value) > level.getMaxHealth()) {
			health = level.getMaxHealth();
		}
	}
	@Override
	public void healFull() {
		health = level.getMaxHealth();		
	}
	@Override
	public int getStrength() {
		return strength;
	}
	@Override
	public void stronger(int value) {
		strength += value;
	}
	@Override
	public int getHealth() {
		return health;
	}
	@Override
	public int getMaxHealth() {
		return level.getMaxHealth();
	}
	@Override
	public Level getLevel() {
		return level;
	}
	@Override
	public boolean hasMaxLevel() { // en el caso del hero, siempre es true (monstruos no tienen)
		return true;
	}
	@Override
	public void addExperience(int value) {
		if ((experience += value) > getMaxExperience()) {
			level.levelUp();
			experience = 0;
			health = getMaxHealth();
		}
	}
	@Override
	public int getExperience() {
		return experience;
	}
	@Override
	public int getMaxExperience() {
		return level.getMaxExperience();
	}
	@Override
	public Content interact(Fighter hero) {
		return null;
	}
}
