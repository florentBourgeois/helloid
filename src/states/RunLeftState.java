package states;

import hero.Hero;

public class RunLeftState extends PlayerState {

	public RunLeftState(Hero player) {
		super(player);
		this.name = "Run left State";	}
	
	public RunLeftState(PlayerState previousState) {
		super(previousState);
		this.name = "Run left State";
	}
	
	@Override
	public void initialize() {
		this.player.setxSpeed(-2);
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
		this.player.setState(new IdleState(this));
	}

	@Override
	public void goLeft() {

		// already running

	}

	@Override
	public void releaseDirection() {
		this.player.setState(new WalkLeftState(this));

	}
}
