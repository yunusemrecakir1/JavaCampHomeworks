package classeswithattributes;

public class Product {
	
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private int id;
	private String renk;
	private String kod;

	public int getId1() {
		return id;
	}

	public void setIdi(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod(String kod) {
		return this.name.substring(0, 1) + id;
	}

}
