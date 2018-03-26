package refactoring.chap09;

public class StateLogging extends State {

	@Override
	public int getTypeCode() {
		return Logger.STATE_LOGGING;
	}

}
