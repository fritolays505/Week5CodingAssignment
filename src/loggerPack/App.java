package loggerPack;

public class App {
	
	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello asterisk log");
		System.out.println("--------");
		asteriskLogger.error("Hello error log");
		System.out.println("--------");
		spacedLogger.log("Hello spaced logger");
		System.out.println("--------");
		spacedLogger.error("Does this error work?");
		
		
	}

}
