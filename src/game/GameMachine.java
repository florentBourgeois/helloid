package game;

import java.util.Random;

import base.DomainObject;
import hero.Hero;

public class GameMachine extends DomainObject {
	
	private Hero hero;
	//private Controller controller;
	//private Level currentLevel;
	
	public GameMachine() {
		this.name = "Game machine";
		this.initialize();
	}
	
	public static void newGameMessage() {
		System.out.println("--------------------\nWelcome in Helloid\n\tNew Game\n--------------------");
	}
	
	public static Hero newGameHero() {
		String names[] = {"Jack", "Fred", "Maya", "Elisia", "Magic Mad Man", "BouBou", "dydy", "MadDolphin", "Sabertooth"};
		return new Hero(names[new Random().nextInt(9)]);
	}
	
	private void initialize() {
		newGameMessage();
		this.hero = newGameHero();
		//this.controller = newGameController();
		//this.level = newGameLevel();
		
	}
	
	
	
	
	
	
	
}
