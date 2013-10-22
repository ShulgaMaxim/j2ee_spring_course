package lectureOne;

public class Product implements IProduct
{

    private final int price;
    private final int quan;
    private final ICategory category;

    public Product(int price, int quan, ICategory category)
    {
        this.price = price;
        this.quan = quan;
        this.category = category;
        System.out.println(this.toString());
    }

    public ICategory getCategory()
    {
        return category;
    }

    public int getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quan;
    }

    @Override
    public String toString()
    {
        return quan + " " + price + " " + category.toString();
    }

}
