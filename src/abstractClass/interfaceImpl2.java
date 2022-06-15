package abstractClass;

public class interfaceImpl2 implements interfaceEx2, interfaceEx3{
    @Override
    public void test1() {
        System.out.println("interfaceEx2의 추상 메서드");
    }
    @Override
    public void test2() {
        System.out.println("interfaceEx3의 추상 메서드");
    }
    public static void main(String[] args) {
        interfaceImpl2 if2 = new interfaceImpl2();

        if2.test1();
        if2.test2();
    }
}
interface interfaceEx2 {
    void test1();
}
interface interfaceEx3{
    void test2();
}
