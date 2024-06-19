import Student.Student;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("이소정", 0100000000);
        Person person2 = new Person("이소정", 0100000000, 20, 1000000000);
        Student student = new Student();
        person2.teaching(student);
    }
}
