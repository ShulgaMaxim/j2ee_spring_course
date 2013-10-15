package lectureOne;

public class Category implements ICategory {

	private final String name;

	public String getName() {
		return name;
	}

	public Category(String name) {
		System.out.println("Created new category");
		this.name = name;
	}

}
