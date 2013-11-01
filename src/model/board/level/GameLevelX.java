package model.board.level;

import java.awt.Point;

import model.board.Board;
import model.fighter.Hero;

public class GameLevelX extends Board{
	private int enemies = 5;
	private Point heroInitPosition = new Point(3,2); // a mano
	

	@Override
	protected void setContents() {
		get((int)heroInitPosition.getX(), (int)heroInitPosition.getY()).setContent(new Hero());
	}

	@Override
	protected Point getHeroInitPosition() {
		return heroInitPosition;
	}

	@Override
	public boolean gameOver() {
		return !getHero().isAlive();
	}

	@Override
	public boolean playerWon() {
		return enemies == 0;
	}
	
}
