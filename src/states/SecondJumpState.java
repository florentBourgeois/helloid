package states;

import hero.Hero;

public class SecondJumpState extends PlayerState {

	public SecondJumpState(Hero player) {
		super(player);
		this.name = "Second jump State";
	}
	
	public SecondJumpState(PlayerState previousState) {
		super(previousState);
		this.name = "Second jump State";
	}
	
	@Override
	public void initialize() {
		this.player.setySpeed(1);
	}

	@Override
	public void jump() {
		// cannot jump another time 
		//notice that if a new upgrade enhance jump numbers we are not good

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
