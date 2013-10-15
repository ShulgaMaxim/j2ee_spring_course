package lectureOne;

import java.util.List;

public interface IWareHouse {

	public List<IProduct> getGoods();
	
	public IProduct takeProduct(int idx);
	
	public void addProduct(IProduct prod);
	
	public IExtract getExtract();
		
}
