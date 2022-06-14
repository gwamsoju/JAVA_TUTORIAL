package Generics;

import java.util.ArrayList;

public class FruitBoxEx1 {

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy()); 에러.

        toyBox.add(new Toy());

        System.out.println(fruitBox.toString());
        System.out.println(appleBox.toString());
        System.out.println(toyBox.toString());

    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString(){return list.toString();}
}

class Fruit {public String toString(){return "Fruit";}}
class Apple extends Fruit {public String toString(){return "Apple";}}
class Grape extends Fruit {public String toString(){return "Grape";}}
class Toy {public String toString(){return "Toy";}}
