package states;

import player.Player;

public class IdleState extends PlayerState {

	
	public IdleState(Player player) {
		super(player);
		this.name = "Idle State";
	}
	
	public IdleState(PlayerState previousState) {
		super(previousState);
		this.name = "Idle State";
	}

	@Override
	public void initialize() {
		this.player.setxSpeed(0);
		this.player.setySpeed(0);
	}
	
	@Override
	public void jump() {
		this.player.setState(new JumpState(this));
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
		this.player.setState(new WalkLefttState(this));
	}

	@Override
	public void releaseDirection() {
		// already done

	}



}
