package OverloadingVSOverriding;

public class OverloadingEx {

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();

        ot.test(); // 매개 변수가 없다.
        ot.test(1,2); // 매개 변수 a의 값은 1, b의 값은 2이다.
        ot.test("안녕하세요 !"); // 안녕하세요 !
    }
}

class OverloadingTest{

    // 매개 변수 X
    void test(){
        System.out.println("매개 변수가 없다.");
    }
    // 매개 변수 2개
    void test(int a , int b){
        System.out.println("매개 변수 a의 값은 " + a + ", b의 값은 " + b +"이다.");
    }
    //매개 변수 1개
    void test(String str){
        System.out.println(str);
    }
}
