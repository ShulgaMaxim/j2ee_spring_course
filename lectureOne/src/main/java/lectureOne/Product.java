package lectureOne;

public class Product implements IProduct {

	private final int price;
	private final int quan;
	private final ICategory category;
	
	
	
	public Product(int price, int quan, ICategory category) {
		System.out.println("Created new product");
		this.price = price;
		this.quan = quan;
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quan;
	}
	
	public ICategory getCategory() {
		return category;
	}

}
