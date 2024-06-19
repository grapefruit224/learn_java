// 객체지향과 메소드를 결합한 코드
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // 계좌 생성자
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // 입금 메소드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금 메소드
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 잔액 조회 메소드
    public void printBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 계좌 생성
        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
        System.out.print("소유자 이름을 입력하세요: ");
        String ownerName = scanner.nextLine();
        BankAccount account = new BankAccount(accountNumber, ownerName);

        // 입금 및 출금
        account.deposit(100000); // 예시 입금
        account.withdraw(50000); // 예시 출금
        account.deposit(10000000);
        account.deposit(10000000);

        // 잔액 조회
        account.printBalance();

        scanner.close();
    }
}