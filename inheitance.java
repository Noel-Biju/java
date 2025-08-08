class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}	
class Ebook extends Book{
	double fileSizeMB;
	Ebook(String title,String author,double price,double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println("File Size: "+fileSizeMB);
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println("Number Of Pages: "+numberOfPages);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Ebook ebook=new Ebook("Java","SS",199.99,60.74);
		ebook.displayDetails();
		PrintedBook printbook=new PrintedBook("Python","jj",299.00,240);
		printbook.displayDetails();
	}
}
