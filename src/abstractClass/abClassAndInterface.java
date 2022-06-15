package abstractClass;

public class abClassAndInterface extends abstractClass implements interfaceEx4{
    @Override
    void method1() {
        System.out.println("추상 클래스 내에 추상 메서드");
    }

    @Override
    public void method3() {
        System.out.println("인터페이스 내에 추상 메서드");
    }

    public static void main(String[] args) {
        abClassAndInterface ai = new abClassAndInterface();

        ai.method1();
        ai.method2();
        ai.method3();
    }
}
abstract class abstractClass{

    abstract void method1();

    void method2(){
        System.out.println("추상 클래스의 일반 메서드");
    }
}
interface interfaceEx4{

    void method3();
}
