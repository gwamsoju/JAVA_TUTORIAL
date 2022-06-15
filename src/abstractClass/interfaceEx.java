package abstractClass;

public interface interfaceEx {

    void method1(); // 아무것도 붙이지 않으면  public abstract이 붙는다.

    default void method2(){ // default로 선언할 경우 구현하는 곳에서 오버라이딩 가능
        System.out.println("interface 내에 default 메서드");
    }

    static void method3(){ // static으로 선언할 경우 구현하는 곳에서 오버라이딩 불가능. interface에서만 메서드를 수정할 수 있다.
        System.out.println("interface 내에 static 메서드");
    }

}
