package hero;

import base.DomainObject;
import states.IdleState;
import states.PlayerState;

public class Hero extends DomainObject implements HeroActions{
	private int x = 50;
	private int y = 50;
	private int xSpeed = 0;
	private int ySpeed = 0;
	
	private PlayerState state = new IdleState(this);
	
	
	public Hero() {
		this.name = "default Player";
		this.initialize();
	}

	
	public Hero(String name) {
		this.name = name;
		this.initialize();
	}

	
	public void initialize() {
		this.state = new IdleState(this);
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
	public void jump() {
		this.state.jump();
		this.print();
	}


	@Override
	public void touchGround() {
		this.state.touchGround();
		this.print();
	}


	@Override
	public void goRight() {
		this.state.goRight();
		this.print();
	}


	@Override
	public void goLeft() {
		this.state.goLeft();
		this.print();
	}


	@Override
	public void releaseDirection() {
		this.state.releaseDirection();
		this.print();
	}
	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(" : {\n\tx : ").append(this.x)
			.append("\n\ty : ").append(this.y)
			.append("\n\tx speed : ").append(this.xSpeed)
			.append("\n\tyspeed : ").append(this.ySpeed)
			.append("\n\tcurrent State : ").append(this.state);
		return sb.toString();
	}

	
}
