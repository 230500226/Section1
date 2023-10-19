// LibrarySystem class
class LibrarySystem {
    private List<Book> books = new ArrayList<>();

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        _____.out.println("Book added successfully.");
    }

    // Retrieve a book by its title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Retrieve all books by a specific author
    public List<Book> findBookByAuthor(String author) {
        List<Book> foundBooks = new _____<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
