package classeswithattributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setIdi(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("red");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//System.out.println(product.getKod());
		
		
	}
}