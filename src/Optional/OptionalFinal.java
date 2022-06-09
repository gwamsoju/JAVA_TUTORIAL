package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalFinal {

    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    static void step1(){
        System.out.println("******** Optional 객체 생성 ********");
        School nullSchool = new School(null, null);
        School notNullSchool = new School("유성고등학교",null);
        Optional<String> optNull = Optional.ofNullable(nullSchool.getName());
        Optional<String> optNotNull = Optional.ofNullable(notNullSchool.getName());
        String nullSchoolName = optNull.orElse("입력된 학교가 없습니다.");
        String notNullSchoolName = optNotNull.orElse("입력된 학교가 없습니다.");
        System.out.println("nullSchoolName = " + nullSchoolName);
        System.out.println("notNullSchoolName = " + notNullSchoolName);
        System.out.println("************************************");
    }

    static void step2(){
        System.out.println("******** 방어 코드 활용 ********");
        List<Ban> list = new ArrayList<Ban>();
        list.add(new Ban(new Student(null)));
        School school = new School(null, list);
        System.out.println("일반적인 Null 방어");
        nullDefense1(school);
        System.out.println("Optional을 사용한 Null 방어");
        nullDefense2(school);
        System.out.println("************************************");
    }

    static void step3(){
        System.out.println("Optional을 활용해 정상적인 출력을 하는 과정.");
        List<Ban> list = new ArrayList<Ban>();
        list.add(new Ban(new Student("이재영")));
        School school = new School("유성고등학교",list);
        String s = Optional.of(school)
                .map(School::getBan)
                .map(banList -> banList.get(0))
                .map(Ban::getStudent)
                .map(Student::getName)
                .orElse("없는 학생입니다.");
        System.out.println(s);
    }

    static void nullDefense1(School school){
        String stuName = "";
        if(school != null){
            List<Ban> banList = school.getBan();
            if(banList != null){
                Ban ban = banList.get(0);
                if(ban != null){
                    Student student = ban.getStudent();
                    if(student != null){
                        if(student.getName() != null){
                            stuName = student.getName();
                            System.out.println("학생의 이름은 " + stuName + "입니다.");
                            return;
                        }
                    }
                }
            }
        }
        stuName="없는 학생입니다.";
        System.out.println(stuName);
        System.out.println("************************************");
    }

    static void nullDefense2(School school){
        System.out.println("------- 첫 번째 ---------");
        Optional<School> schoolOpt = Optional.ofNullable(school);
        Optional<List<Ban>> bans = schoolOpt.map(School::getBan);
        Optional<Ban> ban = bans.map(banList -> banList.get(0));
        Optional<Student> student = ban.map(Ban::getStudent);
        Optional<String> stuName = student.map(Student::getName);
        String s = stuName.orElse("없는 학생입니다.");
        System.out.println(s);
        System.out.println("------- 두 번째 ---------");
        String s1 = Optional.ofNullable(school)
                .map(School::getBan)
                .map(banList -> banList.get(0))
                .map(Ban::getStudent)
                .map(Student::getName)
                .orElse("없는 학생입니다.");
        System.out.println(s1);
    }
}

class School {
    String name;
    List<Ban> ban;

    School(String name, List<Ban> ban){
        this.name = name;
        this.ban = ban;
    }
    public String getName(){
        return name;
    }
    public List<Ban> getBan(){
        return ban;
    }
}

class Ban{
    Student student;

    Ban(Student student){
        this.student = student;
    }
    public Student getStudent(){
        return student;
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}