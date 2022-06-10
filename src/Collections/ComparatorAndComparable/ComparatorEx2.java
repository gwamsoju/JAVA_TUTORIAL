package Collections.ComparatorAndComparable;

import java.util.Comparator;

public class ComparatorEx2 {
    //익명 객체 구현 방식
    public static void main(String[] args) {
        Student stu1 = new Student(19,1);
        Student stu2 = new Student(18,2);

        int isBig = comp.compare(stu1, stu2);
        if(isBig > 0){
            System.out.println("stu1의 나이가 더 많다.");
        }else if(isBig == 0){
            System.out.println("나이가 같다.");
        }else{
            System.out.println("stu2의 나이가 더 많다.");
        }
    }

    static Comparator<Student> comp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };
}

class Student {

    int age;
    int classNumber;

    Student(int age, int classNumber){
        this.age = age;
        this.classNumber = classNumber;
    }
}

