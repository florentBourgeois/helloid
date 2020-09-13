package states;

import hero.Hero;

public class WalkLeftState extends PlayerState {

	public WalkLeftState(Hero player) {
		super(player);
		this.name = "walk left State";	}
	
	public WalkLeftState(PlayerState previousState) {
		super(previousState);
		this.name = "walk left State";
	}
	
	@Override
	public void initialize() {
		this.player.setxSpeed(-1);
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
		this.player.setState(new WalkRightState(this));
	}

	@Override
	public void goLeft() {
		this.player.setState(new RunLeftState(this));
	}

	@Override
	public void releaseDirection() {
		this.player.setState(new IdleState(this));

	}

}
