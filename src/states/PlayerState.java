package states;

import base.DomainObject;
import hero.Hero;
import hero.HeroActions;

public abstract class PlayerState extends DomainObject implements HeroActions{
	
	protected Hero player;
	
	public PlayerState(Hero player) {
		this.player = player;
		this.name = "State";
		this.initialize();
	}
	 
	public PlayerState(PlayerState previousState) {
		this.player = previousState.getPlayer();
		this.name = "State";
		this.initialize();
	}
	
	public void setPlayer(Hero player) {
		this.player = player;
	}
	
	public Hero getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	
}
