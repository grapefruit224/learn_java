import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book information for the book shelf:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Identifier (String): ");
        String identifier = scanner.nextLine();
        Book<String> bookForShelf = new Book<>(title, author, identifier);
        bookShelf.addBook(bookForShelf);

        System.out.println("Enter book information for the book stack:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Identifier (Integer): ");
        int intIdentifier = scanner.nextInt();
        Book<Integer> bookForStack = new Book<>(title2, author2, intIdentifier);
        bookStack.pushBook(bookForStack);

        System.out.println(bookShelf.searchByTitle(title));
        System.out.println(bookShelf.searchByAuthor(author));

        System.out.println(bookStack.popBook());
        System.out.println(bookStack.peekBook());

        System.out.println(bookStack.isEmpty());
    }
}