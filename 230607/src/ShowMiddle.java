import java.util.Scanner;

public class ShowMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(getMiddle(str));
    }
    public static String getMiddle(String str){
        String result = "";
        int middle = str.length()/2;
        if (str.length() < 3)   return str;

        if(str.length() % 2 == 1){
            result = str.substring(middle-1, middle+2);
        }

        return result;
    }
}