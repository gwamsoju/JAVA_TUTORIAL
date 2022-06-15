package abstractClass;

public class abstractClassExtends extends abstractClassEx{
    @Override
    void abstractEx1() {
        System.out.println("추상 클래스의 추상 메서드");
    }

    public static void main(String[] args) {
        abstractClassExtends ab = new abstractClassExtends();

        ab.abstractEx1(); // 추상 클래스에서 추상 메서드로 정의한 경우 따로 재정의 과정이 필요함.
        ab.abstractEx2(); // 추상 클래스에서 일반 메서드로 정의한 경우 따로 재정의가 필요없이 바로 사용 가능.
    }
}
