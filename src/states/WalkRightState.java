package states;

import hero.Hero;

public class WalkRightState extends PlayerState {

	public WalkRightState(Hero player) {
		super(player);
		this.name = "Walk right State";	}
	
	public WalkRightState(PlayerState previousState) {
		super(previousState);
		this.name = "Walk right State";
	}
	
	@Override
	public void initialize() {
		this.player.setxSpeed(1);
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
		this.player.setState(new RunRightState(this));
	}

	@Override
	public void goLeft() {
		this.player.setState(new WalkLeftState(this));
	}

	@Override
	public void releaseDirection() {
		this.player.setState(new IdleState(this));

	}

}
