package behaviorTypePatterns.StatePattern;

public class Context {
	
	private State state;
	
	public Context() {
		state=null;
	}
	
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	

}
