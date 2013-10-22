

import java.util.List;

public class WareHouse implements IWareHouse
{

    private List<IProduct> products;

    public WareHouse(List<IProduct> list)
    {
        this.products = list;
    }

    public void addGood(IProduct good)
    {
        products.add(good);
    }

    public void addProduct(IProduct prod)
    {
        products.add(prod);

    }

    public IExtract getExtract()
    {
        return new Extract(this);
    }

    public List<IProduct> getGoods()
    {
        return products;
    }

    public IProduct takeProduct(int idx)
    {
        return products.get(idx);
    }

}
