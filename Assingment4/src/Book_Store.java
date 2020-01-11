import java.util.Scanner;

public class Book_Store {
	
	int yop;
	String author;
	String name;
	int price;
	
	
	Book_Store(int yop,String author,String name,int price)
	{
		this.yop=yop;
		this.author =author;
		this.name= name;
		this.price=price;
		
	}
	

	public int getYop() {
		return yop;
	}


	public void setYop(int yop) {
		this.yop = yop;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	void disp()
	{
		System.out.println("the  year of publication  "+yop);
		//int yop=sc.nextInt();
		System.out.println("Enter the book's author  "+author);
		//String author=sc.next();
		System.out.println("Enter the book's name  "+name);
		//String name=sc.next();
		System.out.println("Enter the book's price  "+price);
	//	int price=sc.nextInt();
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book's year of publication");
		int yop=sc.nextInt();
		System.out.println("Enter the book's author");
		String author=sc.next();
		System.out.println("Enter the book's name");
		String name=sc.next();
		System.out.println("Enter the book's price");
		int price=sc.nextInt();
		
		Book_Store e=new Book_Store(yop,author,name,price);
         e.disp();
	}

}
