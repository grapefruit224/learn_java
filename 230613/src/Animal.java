public abstract class Animal {
    String name;
    String kind;

    void setName(String name){
        this.name = name;
    }
    public void sleep(){
        System.out.println(this.name+"은 자는 중.....");
    }
    public abstract void sound();
}
