package states;

import base.DomainObject;
import player.Player;

public abstract class PlayerState extends DomainObject{
	
	protected Player player;
	
	public PlayerState(Player player) {
		this.player = player;
		this.name = "State";
		this.initialize();
	}
	 
	public PlayerState(PlayerState previousState) {
		this.player = previousState.getPlayer();
		this.name = "State";
		this.initialize();
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public abstract void initialize();
	public abstract void jump();
	public abstract void touchGround();
	public abstract void goRight();
	public abstract void goLeft();
	public abstract void releaseDirection();
	
}
