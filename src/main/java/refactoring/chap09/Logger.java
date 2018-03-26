package refactoring.chap09;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private int state;
	
	public Logger() {
		setState(STATE_STOPPED);
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void start() {
		switch(getState()) {
		case STATE_STOPPED:
			System.out.println("** START LOGGING **");
			setState(STATE_LOGGING);
			break;
		case STATE_LOGGING:
			break;
		default:
			System.out.println("Invalid state : "+getState());
		}
	}
	public void stop() {
		switch (getState()) {
			case STATE_STOPPED:
				break;
			case STATE_LOGGING:
				System.out.println("** STOP LOGGING **");
				setState(STATE_STOPPED);
				break;
			default:
				System.out.println("Invalid state : "+getState());
		}
	}
	public void log(String info) {
		switch (getState()) {
		case STATE_STOPPED:
			System.out.println("Ignoring : "+info);
			break;
		case STATE_LOGGING:
			System.out.println("Logging : "+ info);
			break;
		default:
			System.out.println("Invalid state : "+getState());
		}
	}
}
