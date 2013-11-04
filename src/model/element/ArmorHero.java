package model.element;

import model.fighter.FighterHero;
import model.fighter.level.Level;

public class ArmorHero extends FighterHero {
	
	public ArmorHero(int health, int strength, Level level, int experience){
		super(health, strength, level, experience);
	}
	@Override
	public void injured(final int value) {
		injured((int)(value*0.7));
	}
}
