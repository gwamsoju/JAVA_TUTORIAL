package OverloadingVSOverriding;

public class OverloadingEx {

    public static void main(String[] args) {
        Practice practice = new Practice();

        practice.A(1); // 1
        System.out.println(practice.A(1,2)); // 3
        System.out.println(practice.A(1,2,3)); // 6
    }
}

class Practice {

    public void A(int a){
        System.out.println(a);
    }

    public int A(int a, int b){
        return a + b;
    }

    public int A(int a, int b, int c){
        return a * b * c;
    }
}
