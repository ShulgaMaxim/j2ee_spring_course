

import java.util.List;

public interface IWareHouse
{

    public void addProduct(IProduct prod);

    public IExtract getExtract();

    public List<IProduct> getGoods();

    public IProduct takeProduct(int idx);

}
