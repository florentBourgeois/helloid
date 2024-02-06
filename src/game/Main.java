package game;

import java.util.Random;

import hero.Hero;

public class Main {

	public static void main(String[] args) {
		simpleTest();
	}
	
	public static void simpleTest() {
		GameMachine.newGameMessage();
		Hero p = GameMachine.newGameHero();
		p.releaseDirection();

		p.goRight();

		p.jump();

		p.releaseDirection();
		
		p.jump();
		
		p.jump();
		
		p.jump();

		
	}

}
