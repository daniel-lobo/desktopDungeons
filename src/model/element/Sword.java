package model.element;

import model.board.Content;
import model.fighter.Fighter;
import model.fighter.FighterHero;
import model.fighter.Hero;
import model.fighter.SwordHero;

public class Sword extends ValuableElements {

	public Sword(int value) {
		super(value);
	}
	
	@Override
	public Content interact(Fighter hero){
		return new Hero(new SwordHero(hero, this));
	}	
	
}