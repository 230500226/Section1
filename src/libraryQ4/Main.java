// Demonstration with user input
_____ class Main {
    public _____ void main(_____ [] args) {
        Scanner _____ = new Scanner(_____);
        LibrarySystem library = new _____();

        System.out.println("Library System");
        System.out.println("1. Add a new book");
        System.out.println("2. Search for a book by title");
        System.out.println("3. Search for books by author");
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (_____) {
            case 1:
                System.out.print("Enter book title: ");
                String title = _____.nextLine();
                System.out.print("Enter book author: ");
                String author = _____.nextLine();
                System.out.print("Enter book ISBN: ");
                String ISBN = _____.nextLine();
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
                _____(booksByAuthor.size() > 0) {
                    for (Book book : booksByAuthor) {
                        System.out.println(book);
                    }
                } else {
                    System.out.println("No books found by this author.");
                }
                break;
            _____:
                System.out.println("Invalid choice.");
        }

        _____.close();
    }
}
