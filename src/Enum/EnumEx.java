package Enum;

public class EnumEx {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
        step4();
    }
    static void step1(){
        System.out.println("===== 열거형의 정의와 사용 =====");
        System.out.println("enum 열거형이름 { 상수명 1, 상수명 2 ...... }");
        System.out.println("Ex) enum Direction { EAST, SOUTH, WEST, NORTH }");
        System.out.println("열거형 상수는 '=='를 사용할 수 있다. (equals()도 가능 !)");
        System.out.println("단, '>' , '<'와 같은 비교 연산자는 사용할 수 없고, compareTo()는 사용 가능");
        System.out.println("getDeclaringClass() : 열거형의 Class 객체를 반환");
        System.out.println("name() : 열거형 상수의 이름을 문자열로 반환");
        System.out.println("ordinal() : 열거형 상수가 정의된 순서를 반환");
        System.out.println("valueOf() : 지정된 열거형에서 name과 일치하는 열거형 상수를 반환");
        System.out.println("EnumTest1 참조");
        System.out.println();
    }
    static void step2(){
        System.out.println("===== 열거형에 멤버 추가하기 =====");
        System.out.println("열거형 상수의 값이 불연속적인 경우 이름 옆에 원하는 값을 괄호에 함께 적어준다.");
        System.out.println("Ex) enum Directon { EAST(1), SOUTH(5), WEST(-1), NORTH(10) }");
        System.out.println("그리고 지정된 값을 저장할 수 있도록 생성자와 인스턴스 변수를 추가해줘야한다.");
        System.out.println("enum Direction {");
        System.out.println(" EAST(1), SOUTH(5), WEST(-1), NORTH(10) ;");
        System.out.println(" private final int value;");
        System.out.println(" Direction(int value) { this.value = value; }");
        System.out.println(" public int getValue() {return value; }");
        System.out.println("}");
        System.out.println("EnumTest2 참조");
        System.out.println();
    }
    static void step3(){
        System.out.println("===== 열거형에 추상 메서드 추가하기 =====");
        System.out.println("EnumTest3 참조 ");
        System.out.println();
    }
    static void step4(){
        System.out.println("===== 열거형의 이해 =====");
        System.out.println("열거형이 아래와 같이 정의되어 있을 때,");
        System.out.println("enum Direction { EAST, SOUTH, WEST, NORTH}");
        System.out.println("열거형 상수 하나하나가 Direction의 객체이다.");
        System.out.println("클래스로 변환하면 아래와 같을 것이다.");
        System.out.println("class Direction {");
        System.out.println("    static final Direction EAST = new Direction(\"EAST\")");
        System.out.println("    static final Direction SOUTH = new Direction(\"SOUTH\")");
        System.out.println("    static final Direction WEST = new Direction(\"WEST\")");
        System.out.println("    static final Direction NORTH = new Direction(\"NORTH\")");
        System.out.println("    private String name;");
        System.out.println("    private Direction(String name) {");
        System.out.println("    this.name = name ;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();
    }
}
