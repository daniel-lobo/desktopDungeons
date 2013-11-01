package model.fighter.level;

public class LevelHero extends Level {
	
	public LevelHero() {
		super(1, 20);
	}
	@Override
	public int getMaxHealth() {
		return 10*getValue();
	}
	@Override
	public int getStrength() {
		return 5*getValue();
	}
	@Override
	public int getMaxExperience() {
		return 5*getValue();
	}
	
}
