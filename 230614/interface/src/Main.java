public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);
    }
}
