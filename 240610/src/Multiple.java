public class Multiple {
    public static void main(String[] args) {
        System.out.println(isCool(22)); // true (11의 배수)
        System.out.println(isCool(23)); // true (11의 배수보다 1 큼)
        System.out.println(isCool(24)); // false (11의 배수도 아니고, 11의 배수보다 1 크지도 않음)
    }
    public static boolean isCool(int num){
        boolean flag = false;
        if (num% 11 == 0 || num % 11 == 1) flag = true;
        return flag;
    }
}