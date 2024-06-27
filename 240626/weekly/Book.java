//도서 정보의 객체를 만드는 클래스
public class Book<T> {
    private String title;
    private String author;
    private T identifier;

    //생성자
    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }
}
