
public class Book {
    private String name;
    private String description;
	private Double cost;
	private String category;
	private String author;
	public Book(String name, String description, Double cost, String category, String author) {
		super();
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.category = category;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Fill your code here
	
	
}
