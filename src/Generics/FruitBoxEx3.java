package Generics;

import java.util.ArrayList;

class Fruit2 { public String toString() { return "Fruit";}}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}}
class Grape2 extends Fruit2 { public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name){
        this.name = name + "Juice";
    }

    public String toString(){ return name;}

    static Juice makeJuice(FruitBox2<? extends Fruit2> box){ // Fruit2의 자손들은 모두 매개 변수로 올 수 있음. 조상은 안됨.
        String tmp = "";

        for(Fruit2 f : box.getList()){
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {

    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox2 = new FruitBox2<>();
        FruitBox2<Apple2> appleBox2 = new FruitBox2<>();

        fruitBox2.add(new Apple2());
        fruitBox2.add(new Grape2());
        appleBox2.add(new Apple2());
        appleBox2.add(new Apple2());

        System.out.println(Juice.makeJuice(fruitBox2));
        System.out.println(Juice.makeJuice(appleBox2));
    }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString(){return list.toString();}
}