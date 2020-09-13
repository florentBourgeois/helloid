package player;

import base.DomainObject;
import states.PlayerState;

public class Player extends DomainObject{
	private int x = 50;
	private int y = 50;
	private int xSpeed = 0;
	private int ySpeed = 0;
	
	private PlayerState state = new IddleState(this);
	
	
	public Player() {
		this.name = "default Player";
		this.initialize();
	}

	
	public Player(String name) {
		this.name = name;
		this.initialize();
	}

	
	public void initialize() {
		this.state = new IddleState(this);
	}
	
	public PlayerState getState() {
		return state;
	}
	
	public void setState(PlayerState state) {
		this.state = state;
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getxSpeed() {
		return xSpeed;
	}


	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}


	public int getySpeed() {
		return ySpeed;
	}


	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(" : {\n\tx : ").append(this.x)
			.append("\n\ty : ").append(this.y)
			.append("\n\tx speed : ").append(this.xSpeed)
			.append("\n\tyspeed : ").append(this.ySpeed)
			.append("current State : ").append(this.state);
		return sb.toString();
	}
	

}
