import java.util.ArrayList;
import java.util.List;

//BookManager 메소드를 가져와서 구현하는 클래스
//도서 목록을 List로 관리
public class BookShelf<T> implements BookManager<T>{
    //Book 객체를 저장하는 List
    private List<Book<T>> books;

    //생성자. 빈 List로 정의.
    public BookShelf() {
        books = new ArrayList<>();
    }

    // 아래 메소드들은 인터페이스의 메소드를 오버라이드하여 구현한 메소드
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
            // 제목의 대소문자를 구분하지 않고 부분 일치하는 제목도 검색 결과에 포함시키도록 구현
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
            // 저자의 대소문자를 구분하지 않고 부분 일치하는 제목도 검색 결과에 포함시키도록 구현
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}
