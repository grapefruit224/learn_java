import java.util.Scanner;

public class ArrayError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("배열 크기를 정해주세요.");
            int size = sc.nextInt();

            int[] arr = new int[size];
            int idx = 0;
            while(true){
                System.out.println("정수 입력 해주세요");
                int a = sc.nextInt();
                arr[idx++] = a;
            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 크기를 벗어났어요");
        }
        finally {
            sc.close();
        }
    }
}