package Collections.ComparatorAndComparable;

public class ComparableEx {

    // Comparable 인터페이스를 쓰려면 compareTo 메소드를 구현해야한다.
    //-> 자기 자신과 매개변수 객체를 비교

    public static void main(String[] args) {
        Student2 stu1 = new Student2(19,1);
        Student2 stu2 = new Student2(18,1);

        System.out.println(stu1.compareTo(stu2));

        /*
        int isBig = stu1.compareTo(stu2);

        if(isBig > 0){
            System.out.println("a객체가 b객체보다 큽니다.");
        }else if(isBig == 0){
            System.out.println("두 객체의 크기가 같습니다.");
        }else{
            System.out.println("a객체가 b객체보다 작습니다.");
        }
         */
    }
}

class Student2 implements Comparable<Student2>{

    int age;
    int classNumber;

    public Student2(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student2 o) {
        // 자신의 age가 o.age보다 크다면 1
        if(this.age > o.age){
            return 1;
        }
        // 같다면 0
        else if(this.age == o.age){
            return 0;
        }
        // 작다면 -1
        else{
            return -1;
        }

        /*
        return this.age - o.age;
         */
    }
}