package model.test;

import static org.junit.Assert.*;

import model.element.Armor;
import model.element.HealthPotion;
import model.fighter.FighterEnemy;
import model.fighter.FighterHero;
import model.fighter.Goblin;
import model.fighter.Golem;
import model.fighter.Serpent;
import model.fighter.level.LevelEnemies;

import org.junit.Assert;
import org.junit.Test;

public class FighterTest2 {

	@Test
	public void testFight() {

		FighterHero f = new FighterHero();
		FighterEnemy e = new Goblin(new LevelEnemies(1));
		FighterEnemy go = new Golem(new LevelEnemies(4));
		FighterEnemy se = new Serpent(new LevelEnemies(1));

		while (e.isAlive()) {
			e.interact(f);
		}
		Assert.assertTrue(f.isAlive());
		Assert.assertFalse(e.isAlive());
		
		while (se.isAlive()) {
			se.interact(f);
		}
		Assert.assertTrue(f.isAlive());
		Assert.assertFalse(se.isAlive());

		while (f.isAlive() && go.isAlive()) {
			go.interact(f);
		}

		Assert.assertFalse(f.isAlive());
		Assert.assertTrue(go.isAlive());

	}

	
	
	
	
}
