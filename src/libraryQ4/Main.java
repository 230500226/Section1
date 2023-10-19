// Demonstration with user input

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem();

        System.out.println("Library System");
        System.out.println("1. Add a new book");
        System.out.println("2. Search for a book by title");
        System.out.println("3. Search for books by author");
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                System.out.print("Enter book ISBN: ");
                String ISBN = scanner.nextLine();
                Book newBook = new Book(title, author, ISBN);
                library.addBook(newBook);
                break;
            case 2:
                System.out.print("Enter book title to search: ");
                title = scanner.nextLine();
                Book foundBook = library.findBookByTitle(title);
                if (foundBook != null) {
                    System.out.println(foundBook);
                } else {
                    System.out.println("Book not found.");
                }
                break;
            case 3:
                System.out.print("Enter author's name to search: ");
                author = scanner.nextLine();
                List<Book> booksByAuthor = library.findBookByAuthor(author);
                if (booksByAuthor.size() > 0) {
                    for (Book book : booksByAuthor) {
                        System.out.println(book);
                    }
                } else {
                    System.out.println("No books found by this author.");
                }
                break;
            default :
                System.out.println("Invalid choice.");
        }

       scanner.close();
    }
}
