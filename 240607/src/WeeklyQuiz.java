import java.util.Scanner;

public class WeeklyQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userFunction, a, b;
        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0.종료");
            userFunction = scanner.nextInt();
            //종료와 주어지지 않은 번호 입력시 처리
            if (userFunction == 0) break;
            else if (userFunction > 4) {
                System.out.println("올바른 입력이 아닙니다.");
                continue;
            }
            //첫번째, 두번째 값 입력 받기
            System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
            a = scanner.nextInt();
            System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
            b = scanner.nextInt();

            if (userFunction == 1) System.out.printf("%d + %d = %d\n", a, b, a + b);
            else if (userFunction == 2) System.out.printf("%d - %d = %d\n", a, b, a - b);
            else if (userFunction == 3) System.out.printf("%d * %d = %d\n", a, b, a * b);
            else if (userFunction == 4) {
                if (b == 0) {
                    System.out.println("두번째 값이 올바르지 않습니다.");
                    System.out.println("처음으로 돌아갑니다.");
                    continue;
                }
                System.out.printf("%d / %d = %d\n", a, b, a / b);
            }
        }
    }
}


