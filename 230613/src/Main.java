public class Main {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();

        inheritB.money = 10000;
        inheritB.setMoney();
        inheritB.setMoney();
        inheritB.method2();

        Dog dog = new Dog();
        dog.setName("용팔이");

        dog.sleep();




    }
}