public class InheritA {
    int money;
    int total = 0;

    void setMoney() {
        System.out.println(this.money + "를 저축한다!");
        this.total += this.money;
        System.out.println(total);
    }
}
