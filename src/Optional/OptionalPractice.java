package Optional;

import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {

        //Optional 객체 생성
        String str = "abc";
        Optional<String> optVal = Optional.of(str);
//      Optional<String> optVal = Optional.of("abc");
//      Optional<String> optVal = Optional.of(new String("abc"));

        // 참고 변수의 값이 null일 가능성이 있으면, of()대신 ofNullable()을 사용해야한다.
        Optional<String> optNullable = Optional.ofNullable(null);   // OK

        // 참조 변수를 기본값으로 초기화할 때는 empty()를 사용한다.
        Optional<String> optVal2 = Optional.<String>empty();        // 빈 객체로 초기화

        // Optional 객체의 값 가져오기
        // 객체에 저장된 값을 가져올 때는 get()을 사용한다.
        // 값이 null일 경우 NoSuchElementException이 발생하여, orElse()로 대체할 값을 지정.
        String str1 = optVal.get();
        String str2 = optVal.orElse("");                       // 값이 null일 경우, ""를 반환.
        String str3 = optVal.orElseGet(String::new);                 // 대체할 값을 람다식으로 지정
        String str4 = optVal.orElseThrow(NullPointerException::new); // 지정된 예외를 발생시킴.

        // Stream과 마찬가지로 filter(), map(), flatMap() 사용 가능.
        int result = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);             // result = 123

        // isPresent()는 Optional 객체의 값이 null이면 false를, 아니면 ture를 반환한다.
        if(Optional.ofNullable(str).isPresent()){
            System.out.println(str);
        }
        // ifPresent()를 사용하면 한 줄로 표현 가능.
        Optional.ofNullable(str).ifPresent(System.out::print);




    }
}
