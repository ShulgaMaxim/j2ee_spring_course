package lectureOne;

import java.util.List;

public class WareHouse implements IWareHouse {

	private List<IProduct> products;
	
	public WareHouse(List<IProduct> list) {
		System.out.println("Created new wh");
		this.products = list;
	}

	public List<IProduct> getGoods() {
		return products;
	}

	public void addGood(IProduct good) {
		products.add(good);
	}

	public IExtract getExtract() {
		return new Extract(this);
	}

	public IProduct takeProduct(int idx) {
		return products.get(idx);
	}

	public void addProduct(IProduct prod) {
		products.add(prod);
		
	}

}
