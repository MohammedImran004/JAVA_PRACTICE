import java.util.Scanner;

class Book {
    String name;
    String isbn;
    String author;
    String publisher;

    public Book(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Method to get the book information
    public String getBookInfo() {
        return "Name: " + name + "\nISBN: " + isbn + "\nAuthor: " + author + "\nPublisher: " + publisher + "\n";
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String isbn = sc.nextLine();
            String author = sc.nextLine();
            String publisher = sc.nextLine();

            books[i] = new Book(name, isbn, author, publisher);
            System.out.print("Book " + (i + 1));
            System.out.println();
            System.out.print(books[i].getBookInfo());
        }

        
    }
}
