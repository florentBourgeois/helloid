package states;

import hero.Hero;

public class RunRightState extends PlayerState {

	public RunRightState(Hero player) {
		super(player);
		this.name = "Run right State";	}
	
	public RunRightState(PlayerState previousState) {
		super(previousState);
		this.name = "Run right State";
	}
	
	@Override
	public void initialize() {
		this.player.setxSpeed(2);
	}

	@Override
	public void jump() {
		// shall be in another state thread (jump and directions are cumulative)
	}

	@Override
	public void touchGround() {
		// already on the ground

	}

	@Override
	public void goRight() {
		// already running
	}

	@Override
	public void goLeft() {
		this.player.setState(new IdleState(this));
	}

	@Override
	public void releaseDirection() {
		this.player.setState(new WalkRightState(this));

	}

}
