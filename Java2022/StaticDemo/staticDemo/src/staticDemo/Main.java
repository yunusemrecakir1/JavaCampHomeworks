package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price=20;
		product.name="Mouse";
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
	}
}