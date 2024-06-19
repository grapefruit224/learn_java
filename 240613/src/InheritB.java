public class InheritB extends InheritA {
    String field2;

    void method2() {
        System.out.println("저축할게용");
        super.total -= super.money;
        System.out.println(total);
    }
}
