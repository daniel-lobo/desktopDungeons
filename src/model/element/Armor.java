package model.element;

import model.board.Content;
import model.fighter.Fighter;

public class Armor implements Content {

	public Armor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canWalkOver() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Content interact(Fighter hero) {
		return new ArmorHero(hero.getHealth(), hero.getStrength(), hero.getLevel(), hero.getExperience());
	}
}
