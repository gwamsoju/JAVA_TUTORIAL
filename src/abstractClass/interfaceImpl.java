package abstractClass;

public class interfaceImpl implements interfaceEx{
    public static void main(String[] args) {
        interfaceImpl iI = new interfaceImpl();

        iI.method1();
        iI.method2();
        interfaceEx.method3(); // interface에서 static으로 선언했으므로 구현할 필요없이 바로 메서드 사용 가능.
    }

    @Override
    public void method1() { // interface 내에 추상 메서드
        System.out.println("interface 내에 추상 메서드");
    }

    @Override
    public void method2() { // default 메서드
        interfaceEx.super.method2();
    }
}
