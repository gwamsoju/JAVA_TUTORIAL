package Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVSArrayList {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(200000);
        LinkedList linkedList = new LinkedList();

        System.out.println("순차적으로 추가하기");
        System.out.println("ArrayList : " + add1(arrayList));
        System.out.println("LinkedList : " + add1(linkedList));
        System.out.println();
        System.out.println("중간에서 추가하기");
        System.out.println("ArrayList : " + add2(arrayList));
        System.out.println("LinkedList : " + add2(linkedList));
        System.out.println();
        System.out.println("중간에서 삭제하기");
        System.out.println("ArrayList : " + delete2(arrayList));
        System.out.println("LinkedList : " + delete2(linkedList));
        System.out.println();
        System.out.println("순차적으로 삭제하기");
        System.out.println("ArrayList : " + delete1(arrayList));
        System.out.println("LinkedList : " + delete1(linkedList));
        System.out.println();

        /*
            - 결론 -
            1. 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
            2. 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.
         */
    }
    static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 100000; i++) list.add(i +"");
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 100000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long delete1(List list){
        long start = System.currentTimeMillis();
        for(int i = list.size() - 100; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long delete2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
