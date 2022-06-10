package Collections.ComparatorAndComparable;

import java.util.Comparator;

public class ComparatorEx1 {

    // Comparetor 인터페이스를 쓰려면 compare 메소드를 구현해야한다.
    //-> 두 매개변수를 비교

    public static void main(String[] args) {
        Student1 stu1 = new Student1(19,1);
        Student1 stu2 = new Student1(18,2);

        int isBig = stu1.compare(stu1, stu2);

        if(isBig > 0){
            System.out.println("stu1의 나이가 더 많다.");
        }else if(isBig == 0){
            System.out.println("나이가 같다.");
        }else{
            System.out.println("stu2의 나이가 더 많다.");
        }
    }
}

class Student1 implements Comparator<Student1> {

    int age;
    int classNumber;

    public Student1(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.age - o2.age;
    }
}

