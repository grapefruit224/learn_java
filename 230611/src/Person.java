import Student.Student;

public class Person {

    String name;
    int phoneNumber;
    int age;
    int money;

    public Person(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Person(String name, int phoneNumber, int age, int money){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.money = money;
    }
    public void teaching(Student student){
        student.levelUp();
    }
}