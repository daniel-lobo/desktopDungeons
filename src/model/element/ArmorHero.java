package model.element;

import model.fighter.Fighter;
import model.fighter.FighterHero;
import model.fighter.Hero;
import model.fighter.level.Level;

public class ArmorHero extends Hero {
	
	public ArmorHero(Fighter hero){
		super(hero);
	}
	@Override
	public void injured(final int value) {
		super.injured((int)(value*0.7));
	}
}
