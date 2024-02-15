
public class Book
{
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString()
	{
		return "Title: " + title + ". Author: " + author + ". Price: " + price + ".";
	}
}
