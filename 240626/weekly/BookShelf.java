import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T>{
    private List<Book<T>> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book<T> book) {
        books.remove(book);
    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}