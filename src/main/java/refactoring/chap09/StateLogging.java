package refactoring.chap09;

public class StateLogging extends State {
	private static final StateLogging instance = new StateLogging();
		
	public static StateLogging getInstance() {
		return instance;
	}

	public StateLogging() {
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public int getTypeCode() {
		return Logger.STATE_LOGGING;
	}
*/
	@Override
	public void start(Logger logger) {
		
	}

	@Override
	public void stop(Logger logger) {
		System.out.println("** STOP LOGGING **");
		logger.setState(StateStopped.getInstance());
		
	}

	@Override
	public void log(String info) {
		System.out.println("Logging : "+ info);
		
	}

}
