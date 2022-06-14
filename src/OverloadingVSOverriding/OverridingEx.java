package OverloadingVSOverriding;

public class OverridingEx {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal lion = new Lion();

        lion.setName("사자");

        animal.Myself();
        lion.Myself();
    }
}

class Animal{

    String name;

    void setName(String name){
        this.name = name;
    }

    public void Myself(){
        System.out.println("안녕하세요.");
    }
}

class Lion extends Animal{


    @Override
    public void Myself() {
        System.out.println("안녕하세요. 저는" + super.name + "입니다.");
    }
}
