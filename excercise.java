class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	Book(){
		this.title="gg";
		this.author="adi";
		this.bookID=bookCounter++;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.bookID=bookCounter++;
	}
	void displayBookInfo() {
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("bookID :"+bookID);
	}
	void displayBookInfo(boolean showLibrary) {
		if(showLibrary) {
			System.out.println("Library :"+LIBRARY_NAME);
		}	
	}
	static void displayTotalBooks() {
		System.out.println("Books :"+(bookCounter-1000));
	}
}
public class excercise {
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		Bopk b3=new Book();
	}
}
