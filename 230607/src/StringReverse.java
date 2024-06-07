public class StringReverse {
    public static void main(String[] args) {
        String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";

        for (int i = 0; i < someTxt.length(); i++) {
            System.out.print(someTxt.charAt(i));
        }
        System.out.println();
        for (int j = someTxt.length()-1; j > -1; j--) {
            System.out.print(someTxt.charAt(j));
        }
    }
}
