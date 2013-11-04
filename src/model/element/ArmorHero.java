package model.element;

import model.fighter.FighterHero;
import model.fighter.Hero;
import model.fighter.level.Level;

public class ArmorHero extends Hero {
	
	public ArmorHero(int health, int strength, Level level, int experience){
		super(new FighterHero(health, strength, level, experience));
	}
	@Override
	public void injured(final int value) {
		super.injured((int)(value*0.7));
	}
}
