package week5OOP;

public class App {

	public static void main(String[] args) {

	AsteriskLogger newMsg = new AsteriskLogger();
	AsteriskLogger newError = new AsteriskLogger();
	SpacedLogger msgStr = new SpacedLogger();
	SpacedLogger errStr = new SpacedLogger();
	
	String str1 = "Hi";
	String str2 = "Oh no!";
	
	newMsg.log(str1);
	
	newError.error(str2);
	
	msgStr.log(str1);
	
	errStr.error(str2);
	
	}
	
}