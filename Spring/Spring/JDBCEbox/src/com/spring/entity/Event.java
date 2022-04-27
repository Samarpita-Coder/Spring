
import java.util.List;

public class StandardPackage {
    private String name;
    private String status;
	private Double cost;
	private List<Book> bookList;
    
    
	
	public StandardPackage(String name, String status,  List<Book> bookList) {
		super();
		this.name = name;
		this.status = status;
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public void calculateCost() {
        
		for(Book b:bookList){
    	    cost=cost+b.getCost();
		}
		
	}
	
	public void display() {
		System.out.format("%-25s %-25s %-15s \n","Name","Status","Cost");
		System.out.format("%-25s %-25s %-15s \n", name, status, cost);
		System.out.println("Product Details:");
		System.out.format("%-30s %-40s %-15s %-30s %-15s\n","Name","Description","Cost","Category","Author");
		for(Book bk:bookList) {
			System.out.format("%-30s %-40s %-15s %-30s %-15s\n",bk.getName(),bk.getDescription(),bk.getCost(),bk.getCategory(),bk.getAuthor());
		}
		
		
		
	}
}
