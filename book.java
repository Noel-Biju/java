import java.util.Scanner;
public class OOPS_Demo{
    public static void main(String[] args) {
        Book book =new Book("DC Books");
        book.readbookdetails();
        book.printDetails();
    }
}
class Book{
    String title;
    String author;
    String publisher;
    Book(String publisher){
        this.publisher = publisher;
    }
    Scanner sc=new Scanner(System.in);
    public void readbookdetails(){
        System.out.println("Enter the Title of book:");
        title=sc.nextLine();
        System.out.println("Enter the Author Name:");
        author=sc.nextLine();
    }
    public void printDetails(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Publisher:"+publisher);
    }
}
