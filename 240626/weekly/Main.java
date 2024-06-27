import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bookShelf와 bookStack의 객체 정의.
        // 각 객체의 식별자 타입을 String과 Integer로 정한다.
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        //bookShelf를 위한 book 객체 정의
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter book information for the book shelf: (만약 그만 넣고 싶다면 'stop'을 입력해주세요!)");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("stop")) break;

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Identifier (String): ");
            String identifier = scanner.nextLine();

            Book<String> bookForShelf = new Book<>(title, author, identifier);
            bookShelf.addBook(bookForShelf); // 해당 book 객체를 bookShelf에 추가
        }

        //bookStack을 위한 book 객체 정의
        System.out.println("Enter book information for the book stack:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Identifier (Integer): ");
        int intIdentifier = scanner.nextInt();
        Book<Integer> bookForStack = new Book<>(title, author, intIdentifier);
        bookStack.pushBook(bookForStack); // 해당 book 객체를 bookStack에 추가
        scanner.nextLine();

        //해당 title를 가진 도서가 있는지 검색
        System.out.println("어떤 제목의 도서를 찾고 싶으세요?");
        String find_title = scanner.nextLine();
        for(Book book:bookShelf.searchByTitle(find_title)){
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getIdentifier());
        }

        //해당 저자를 가진 도서가 있는지 검색
        System.out.println("어떤 저자의 도서를 찾고 싶으세요?");
        String find_author = scanner.nextLine();
        for(Book book:bookShelf.searchByAuthor(find_author)){
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getIdentifier());
        }

        //도서 Stack
        try{
            Book popBook = bookStack.popBook();
            System.out.println("\nbookStack에서 pop한 책");
            System.out.println(popBook.getTitle() + " " + popBook.getAuthor() + " " + popBook.getIdentifier());
            Book peekBook = bookStack.peekBook();
            System.out.println("\nbookStack에서 peek한 책");
            System.out.println(peekBook.getTitle() + " " + peekBook.getAuthor() + " " + peekBook.getIdentifier());
        }
        catch(EmptyStackException e){
            System.out.println("Stack is empty");
        }

        //도서 Stack이 비어있는지 확인
        System.out.println("\nbookStack이 비어있나요?");
        System.out.println(bookStack.isEmpty());
    }
}