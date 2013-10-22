

public class Category implements ICategory
{

    private final String name;

    public Category(String name)
    {
        System.out.println(name);
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
