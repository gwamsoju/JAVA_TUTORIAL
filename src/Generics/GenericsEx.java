package Generics;

public class GenericsEx {

    public static void main(String[] args) {
        step1();
        step2();
        step3();
        step4();
        step5();
    }

    static void step1(){
        System.out.println("===== 제네릭스란? =====");
        System.out.println("다양한 타입의 객체들을 다루는 메서드나 컬렉션 " +
                "클래스에 컴파일 시의 타입 체크를 해주는 기능이다.");
        System.out.println("*** 제네릭스의 장점 ***");
        System.out.println("1. 타입 안정성을 제공한다.");
        System.out.println("2. 타입체크와 형변환을 생략해서 코드가 간결해진다.");
        System.out.println();
    }
    static void step2(){
        System.out.println("===== 제네릭스 클래스의 선언 =====");
        System.out.println("class Box<T> {" +"  //제네릭 타입 T를 선언");
        System.out.println("   T item;");
        System.out.println("void setItem(T item) {this.item = item;}");
        System.out.println("   T getItem() {return item};");
        System.out.println("}");
        System.out.println();
    }
    static void step3(){
        System.out.println("===== 제네릭 클래스의 객체 생성과 사용 =====");
        System.out.println("객체를 생성할 때는 다음과 같이 해야한다.");
        System.out.println("Box<Apple> appleBox = new Box<Apple>();" + "// OK");
        System.out.println("Box<Apple> appleBox = new Box<Grape>();" + "// 에러");
        System.out.println();
    }
    static void step4(){
        System.out.println("===== 제한된 제네릭 클래스 =====");
        System.out.println("타입 매개변수 T에 지정할 수 있는 타입의 종류를 제한할 수 있는 방법도 있나?");
        System.out.println("제네릭 타입에 'extends'를 사용하면 특정 타입의 자손들만 대입할 수 있다.");
        System.out.println("class FruitBox<T extends Fruit> {");
        System.out.println("    ArrayList<T> list = new ArrayList<T>();");
        System.out.println("....");
        System.out.println("}");
        System.out.println("여전히 한 종류의 타입만 담을 수 있지만, Fruit클래스의 자손들만 담을 수 있다는 제한이 생김.");
        System.out.println("만약 'Eatable'이라는 인터페이스를 구현해야한다면 이때도 'extends'를 사용한다.");
        System.out.println("인터페이스와 클래스를 동시에 구현해야 한다면 '&' 기호로 연결한다.");
        System.out.println();
    }
    static void step5(){
        System.out.println("===== 와일드 카드 =====");
        System.out.println("<? extents T> : 와일드 카드의 상한 제한. T와 그 자손들만 가능");
        System.out.println("<? super T> : 와일드 카드의 하한 제한. T와 그 조상들만 가능");
        System.out.println("<?> : 제한 없음. 모든 타입이 가능 (즉, <? extends Object>와 동일");
        System.out.println("와일드 카드를 사용해서 makeJuice()라는 메서드의 매개 변수 타입을 FruitBox<Fruit>에서");
        System.out.println("Fruit<? extends Fruit>로 바꾸면 Fruit의 자손들을 모두 매개 변수로 받을 수 있다.");
        System.out.println();
    }
    static void step6(){
        System.out.println("===== 제네릭 메서드 =====");
        System.out.println("메서드 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라고 한다.");
        System.out.println("Ex) static <T> void sort(List<T> list, Comparator<? super T> c ");
        System.out.println("매개 변수의 T와 ");
    }
}
