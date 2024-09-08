package loggerPack;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String message) {
		System.out.println(spaceBetween(message));
	}
	public void error(String message) {
		System.out.println("ERROR: " + spaceBetween(message));
	}
	
	public String spaceBetween(String message) {
		StringBuilder spacedMessage = new StringBuilder();
		for (char character : message.toCharArray()) {
			spacedMessage.append(character).append(" ");
		}
		return spacedMessage.toString();
	}
	
	
}
