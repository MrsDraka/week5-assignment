package week5OOP;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String logMsg) {
		System.out.println("***"+logMsg+"***");
		
	}

	@Override
	public void error(String errorMsg) {
		String error = "***"+"Error: "+errorMsg+"***";
		 
		 StringBuilder asterisks = new StringBuilder();
		 
		 for (int i = 0; i< error.length(); i++) { asterisks.append("*"); }
		 
		 	System.out.println(asterisks); System.out.println(error);
		 	System.out.println(asterisks);
		
	}

}