package polimorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	public void add() {
		System.out.println("Müşteri eklendi");
/*		DatabaseLogger logger = new DatabaseLogger();
		logger.Log("Log mesajı");
*/		this.logger.log("Log mesajı1");
	}
}
