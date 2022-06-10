package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

//     키와 값을 묶어서 하나의 데이터를 저장한다.
//     해싱을 사용해서 많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 보임.
//     키와 값은 각각 Object 타입으로 저장된다.
//     키는 유일해야 하나 값은 중복되어도 된다.

    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<Integer,Person>();

        map.put(1,new Person("이재영",20));
        map.put(2,new Person("전계현",21));
        map.put(3,new Person("이지연",31));
        map.put(4,new Person("최창기",41));
        map.put(5,new Person("강창기",51));

//      entrySet()으로 KEY와 VALUE 출력하기
        for(Map.Entry<Integer, Person> entry : map.entrySet() ){
            System.out.println("KEY : " + entry.getKey() + ", VALUE : " + entry.getValue());
        }
        System.out.println("--------------------------------------------------------");
//      ketSet()으로 KEY와 VALUE 출력하기
        for(Integer i : map.keySet()){
            System.out.println("KEY : " + i + ", VALUE : " + map.get(i));
        }
        System.out.println("--------------------------------------------------------");
//      Iterator 사용해서 KEY와 VALUE 출력하기
        Iterator<Map.Entry<Integer, Person>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Person> next = iterator.next();
            System.out.println("KEY : " + next.getKey() + ", VALUE : " + next.getValue());
        }
        System.out.println("--------------------------------------------------------");
        Iterator<Integer> iterator1 = map.keySet().iterator();
        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            System.out.println("KEY : " + next + ", VALUE : " + map.get(next));
        }
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


