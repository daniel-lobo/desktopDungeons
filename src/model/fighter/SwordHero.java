package model.fighter;

import model.element.Sword;
import model.fighter.level.Level;

public class SwordHero extends FighterHero{
	
	private Sword sword;
	
	public SwordHero(Fighter f,Sword s) {
		super(f.getMaxHealth(),f.getStrength() + s.getValue(),f.getLevel(),f.getExperience());
		this.sword=s;
	}
	
	@Override
	public void setStrenght(int str) {
		
		super.setStrenght(str+sword.getValue());
	}

}
