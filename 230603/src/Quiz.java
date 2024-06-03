public class Quiz {
    public static void main(String[] args) {
        int passScore = 60, myScore = 75;
        if (passScore > myScore) {
            System.out.println("불합격");
        }
        else {
            System.out.println("합격");
        }
        System.out.println((passScore > myScore)?"불합격":"합격");

        int a = 10, b = 20, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else {
            if (b > c) {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

//        if (a > b && a > c){
//            System.out.println(a);
//        }
//        else if (b > c && b > a){
//            System.out.println(b);
//        }
//        else if (c > a && c > b){
//            System.out.println(c);
//        }

        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

        int score = 75;
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        int x = 10;
        if (x>0) {
            System.out.println("양수");
        }
        else if (x<0) {
            System.out.println("음수");
        }
        else {
            System.out.println("0입니다.");
        }

        System.out.println((x>0) ? "양수" : (x<0)?"음수":"0");
    }
}
