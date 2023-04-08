package week5OOP;

public class SpacedLogger implements Logger {
	
	@Override
	public void log (String logMsg) {
		StringBuilder spacedMsg = new StringBuilder();
		
		spacedMsg.append(logMsg.charAt(0));
		for (int i = 1; i<logMsg.length(); i++) {
			spacedMsg.append(" ");
			spacedMsg.append(logMsg.charAt(i));
		}
		
		System.out.println(spacedMsg.toString());
	}

	@Override
	public void error (String errorMsg) {
		StringBuilder spacedError = new StringBuilder();
		
		spacedError.append(errorMsg.charAt(0));
		for (int i = 1; i<errorMsg.length(); i++) {
			spacedError.append(" ");
			spacedError.append(errorMsg.charAt(i));
		}
		
		System.out.println("ERROR: " + spacedError.toString());
	}
}

