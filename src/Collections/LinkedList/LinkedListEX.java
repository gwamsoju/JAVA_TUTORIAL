package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListEX {

    public static void main(String[] args) {
        //LinkedList 선언
        LinkedList<Student> list = new LinkedList<>();
        //값 넣기
        list.add(new Student("aaa",19));
        list.add(new Student("bbb",19));
        list.add(new Student("ccc",19));
        list.add(new Student("ddd",19));
        System.out.println("처음 4개 추가 후 추출하기");
        // list에서 값 추출
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // 값 사이에 값 넣기
        list.add(1,new Student("www",19));
        System.out.println("값 추가 후 추출하기");
        // list에서 값 추출
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
        // 넣은 값 삭제하기
        list.remove(1);

        System.out.println("값 삭제 후 추출하기");
        // list에서 값 추출
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

class Student{
   String name;
   int age;

   Student(String name, int age){
       this.name = name;
       this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
