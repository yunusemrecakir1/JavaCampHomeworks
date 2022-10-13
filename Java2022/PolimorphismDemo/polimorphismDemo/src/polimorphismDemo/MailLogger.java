package polimorphismDemo;

public class MailLogger extends BaseLogger{
	
	public void log(String message) {
		System.out.println("Send to mail "+message);
}
}
