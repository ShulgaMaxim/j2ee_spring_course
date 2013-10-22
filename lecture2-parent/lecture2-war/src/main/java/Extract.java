

public class Extract implements IExtract
{

    private String info;

    public Extract(IWareHouse warehouse)
    {
        info = createInfo(warehouse);
    }

    public String getInfo()
    {
        return info;
    }

    private String createInfo(IWareHouse warehouse)
    {
        StringBuilder sb = new StringBuilder();
        for (IProduct product : warehouse.getGoods())
        {
            sb.append(product.toString() + "\n");
        }
        return sb.toString();
    }

}
