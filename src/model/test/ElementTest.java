package model.test;

import static org.junit.Assert.*;

import model.element.Armor;
import model.element.HealthBonus;
import model.element.HealthPotion;
import model.element.Sword;
import model.fighter.FighterEnemy;
import model.fighter.FighterHero;
import model.fighter.Goblin;
import model.fighter.level.LevelEnemies;

import org.junit.Assert;
import org.junit.Test;

public class ElementTest {

	@Test
	public void PotionTest() {
		FighterHero f = new FighterHero();
		HealthPotion h = new HealthPotion();
		FighterEnemy e = new Goblin(new LevelEnemies(1));

		while (e.isAlive()) {
			e.interact(f);
		}
		Assert.assertFalse(f.getMaxHealth() == f.getHealth());
		h.interact(f);
		Assert.assertTrue(f.getMaxHealth() == f.getHealth());

	}

	@Test
	public void HealthBonusTest() {

		FighterHero f = new FighterHero();
		HealthBonus h = new HealthBonus(20);

		FighterEnemy e = new Goblin(new LevelEnemies(2));

		while (e.isAlive()) {
			e.interact(f);
		}
		Assert.assertFalse(f.getHealth() > 90);
		h.interact(f);
		Assert.assertTrue(f.getHealth() > 90);

	}

	@Test
	public void HealthPotionTest() {

		FighterHero f = new FighterHero();
		HealthPotion h = new HealthPotion();

		FighterEnemy e = new Goblin(new LevelEnemies(2));

		while (e.isAlive()) {
			e.interact(f);
		}
		Assert.assertFalse(f.getHealth() == f.getMaxHealth());
		h.interact(f);
		Assert.assertTrue(f.getHealth() == f.getMaxHealth());

	}

	@Test
	public void ArmorTest() {

		FighterHero f = new FighterHero();
		Armor a = new Armor();
		FighterEnemy e = new Goblin(new LevelEnemies(3));

		while (e.isAlive()) {
			e.interact(f);
		}
		Assert.assertFalse(f.getHealth() > 90);

		FighterHero g = new FighterHero();

		a.interact(g);

		while (e.isAlive()) {
			e.interact(g);
		}

		Assert.assertTrue(g.getHealth() > 90);
	}

	@Test
	public void SwordTest() {
		FighterHero f = new FighterHero();
		FighterEnemy e = new Goblin(new LevelEnemies(4));
		Sword s = new Sword(35);

		while (f.isAlive()) {
			e.interact(f);
		}
		Assert.assertFalse(f.isAlive());

		FighterHero g = new FighterHero();

		s.interact(g);

		while (e.isAlive()) {
			e.interact(g);
		}
		Assert.assertTrue(g.isAlive());

	}

}
