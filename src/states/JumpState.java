package states;

import hero.Hero;

public class JumpState extends PlayerState {

	
	public JumpState(Hero player) {
		super(player);
		this.name = "Jump State";
	}
	
	public JumpState(PlayerState previousState) {
		super(previousState);
		this.name = "Jump State";
	}
	
	@Override
	public void initialize() {
		this.player.setySpeed(1);
	}

	@Override
	public void jump() {
		this.player.setState(new SecondJumpState(this));
	}

	@Override
	public void touchGround() {
		this.player.setState(new IdleState(this));
	}

	@Override
	public void goRight() {
		// shall be in another state thread (jump and directions are cumulative)

	}

	@Override
	public void goLeft() {
		// shall be in another state thread (jump and directions are cumulative)

	}

	@Override
	public void releaseDirection() {
		// shall be in another state thread (jump and directions are cumulative)

	}

}
