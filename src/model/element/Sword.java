package model.element;

import model.board.Content;
import model.fighter.Fighter;

public class Sword extends ValuableElements {

	public Sword(int aValue) {
		super(aValue);
	}
	
	@Override
	public Content interact(Fighter aHero){
		
		return null;
	}	
	//falta terminar de resolver el interact.
}
