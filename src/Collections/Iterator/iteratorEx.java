package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorEx {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator it = list.iterator();

        while(it.hasNext()){ // 읽어 올 요소가 있는지 확인한다.
            System.out.println(it.next()); // 다음 요소를 읽어 온다.
            it.remove(); // 읽어 온 요소를 제거한다.
        }

        System.out.println(it.hasNext()); // false
    }
}
