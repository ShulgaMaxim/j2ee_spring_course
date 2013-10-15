package lectureOne;

public class Extract implements IExtract {
	
	private final IWareHouse warehouse;
	
	public Extract(IWareHouse warehouse) {
		System.out.println("Created new Extract");
		this.warehouse = warehouse;
	}

	public String getInfo() {
		return warehouse.getGoods().toString();
	}

	
	
}
