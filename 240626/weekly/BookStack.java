import java.util.EmptyStackException;
import java.util.Stack;
//도서 목록을 Stack으로 관리하는 클래스

public class BookStack<T> {
    //Book 객체들을 저장하는 Stack
    private Stack<Book<T>> books;

    //생성자
    public BookStack() {
        books = new Stack<>();
    }

    //도서를 추가하는 메소드
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    //맨 나중에 들어온 도서를 리턴하고 제거하는 메소드
    public Book<T> popBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        else return books.pop();
    }

    //맨 나중에 들어온 도서를 리턴하는 메소드
    public Book<T> peekBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        else return books.peek();
    }

    //도서들이 저장된 Stack이 비어있는지 확인하는 메소드
    public boolean isEmpty() {
        return books.isEmpty();
    }
}
