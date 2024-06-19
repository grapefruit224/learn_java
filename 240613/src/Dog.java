public class Dog extends Animal {
    void sleep(int times) {
        System.out.println(name + "zzz..." + times + " hours");
    }

    void sleep(int times, int a){

    }
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("월월");
    }
}
