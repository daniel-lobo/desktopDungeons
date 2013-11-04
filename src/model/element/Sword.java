package model.element;

import model.board.Content;
import model.fighter.Fighter;
import model.fighter.FighterHero;

public class Sword extends ValuableElements {

	public Sword(int value) {
		super(value);
	}
	
	@Override
	public Content interact(Fighter hero){
		hero.stronger(getValue());
		return hero;
	}	
	
}