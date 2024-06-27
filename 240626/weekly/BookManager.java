import java.util.List;
public interface BookManager<T> {
    //도서 추가하는 메소드
    void addBook(Book<T> book);

    //도서 삭제하는 메소드
    void removeBook(Book<T> book);

    //제목으로 도서를 검색하는 메소드
    List<Book<T>> searchByTitle(String title);

    //저자로 도서를 검색하는 메소드
    List<Book<T>> searchByAuthor(String author);
}
