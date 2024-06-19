public class IfPractice {
    public static void main(String[] args) {

        int a = 10, b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        }
        else if (a == b) {
            System.out.println("a and b are equal");
        }
        else {
            System.out.println("a is less than b");
        }

        System.out.println((a > b) ? "a is greater than b" : (a < b) ? "a is less than b" : "a and b is equal");

    }
}