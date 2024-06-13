public class WhoAreYou {
    public static void main(String[] args) {
        MySelf sojeong = new MySelf("이소정", 26, "010000000");
        sojeong.addAdress("서울시");
        sojeong.print();
        sojeong.favorite("테니스");
        sojeong.printFavorite();
    }
}
