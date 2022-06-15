package abstractClass;

public class abstractClassandInterface {

    public static void main(String[] args) {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        step8();
    }
    static void step1(){
        System.out.println("===== 추상 클래스란 ? =====");
        System.out.println("클래스 내에 추상 메서드가 하나 이상 존재하거나 클래스가 abstract로 정의된 것을 말한다.");
        System.out.println("추상 클래스는 클래스에 abstract를 붙이거나 메서드에 abstract를 붙임으로써 선언할 수 있다.");
        System.out.println("Ex)");
        System.out.println("abstract class 클래스 이름 {");
        System.out.println(".....");
        System.out.println("    abstract 반환타입 메서드이름();");
        System.out.println(".....");
        System.out.println("}");
        System.out.println();
    }
    static void step2(){
        System.out.println("===== 인터페이스란 ? =====");
        System.out.println("자바는 단일 상속만 가능하기 때문에 다중 상속을 위해 인터페이스라는 개념이 도입됐다.");
        System.out.println("인터페이스는 추상 클래스의 일종이다.");
        System.out.println("Ex)");
        System.out.println("public interface 인터페이스명 {");
        System.out.println("......");
        System.out.println("}");
        System.out.println();
    }
    static void step3(){
        System.out.println("===== 인터페이스와 추상 클래스의 차이 =====");
        System.out.println("추상 클래스는 일반 메서드와 추상 메서드를 가질 수 있지만");
        System.out.println("인터페이스는 추상 메서드만 가질 수 있다.(자바 8 이후 static, default 메서드 사용 가능 )");
        System.out.println("인터페이스에서는 변수와 메서드에 기본적으로 선언되는 것이 있다. (default, static 메서드 제외)");
        System.out.println("변수에는 public static final이 ");
        System.out.println("메서드에는 public abstract를 컴파일러가 자동으로 수행해준다.");
        System.out.println();
    }
    static void step4(){
        System.out.println("===== 추상 클래스 구현하기 =====");
        System.out.println("abstractClassEx 와 abstractClassExtends를 참조.");
        System.out.println();
    }
    static void step5(){
        System.out.println("===== 인터페이스 구현하기 =====");
        System.out.println("interfaceEx 와 interfaceImpl를 참조.");
        System.out.println();
    }
    static void step6(){
        System.out.println("===== 인터페이스 다중 상속 =====");
        System.out.println("interfaceImpl2 참조.");
        System.out.println();
    }
    static void step7(){
        System.out.println("===== 추상 클래스와 인터페이스 상속 =====");
        System.out.println("abClassAndInterface 참조");
        System.out.println();
    }
    static void step8(){
        System.out.println("===== 정리 =====");
        System.out.println("    추상 클래스");
        System.out.println("추상 클래스 내에서 정의한 추상 클래스는 상속받는 자식 클래스에서 따로 정의를 해줘야 사용 가능 !");
        System.out.println("하지만 일반 클래스는 자식 클래스에서 정의를 해주지 않아도 그대로 사용 가능 !");
        System.out.println("    인터페이스");
        System.out.println("인터페이스는 원래 추상 메서드만 올 수 있었지만 자바 8 이후 default와 static으로 선언하면 일반 메서드도 올 수 있다.");
        System.out.println("추상 메서드는 구현하는 클래스에서 정의를 해줘야 사용 가능 !");
        System.out.println("default 메서드는 인터페이스에서 작성한 그대로 사용할 수 있고 재정의 과정에서 추가할 수 있다.");
        System.out.println("static 메서드는 인터페이스에서 작성한 그대로 사용할 수 있고 재정의 과정을 필요없다.");
    }
}
