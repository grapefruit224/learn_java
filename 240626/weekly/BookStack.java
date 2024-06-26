import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    public BookStack() {
        books = new Stack<>();
    }

    public void pushBook(Book<T> book) {
        books.push(book);
    }
    public Book<T> popBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        return books.pop();
    }
    public Book<T> peekBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        return books.peek();
    }
    public boolean isEmpty() {
        return books.isEmpty();
    }
}
