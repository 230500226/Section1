import java.util.ArrayList;
import java.util.List;
import java.util._____;

// Book class
class Book {
    private String title;
    private String author;
    private String ISBN;

    public _____ (String _____, String author, _____ ISBN) {
        _____.title = title;
        _____.author = author;
        _____.ISBN = ISBN;
    }

    public _____ getTitle() {
        return title;
    }

    public _____ getAuthor() {
        return author;
    }

    public _____ getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}
