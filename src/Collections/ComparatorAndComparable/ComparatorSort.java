package Collections.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSort {

    public static void main(String[] args) {
        // Compator를 사용해서 정렬하기.
        Numbers2[] numbers = new Numbers2[10];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = new Numbers2((int)(Math.random() * 100));
        }

        System.out.print("정렬 전 : ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i].number + " ");
        }

        Arrays.sort(numbers, new Comparator<Numbers2> (){

            @Override
            public int compare(Numbers2 o1, Numbers2 o2) {
                return o1.number - o2.number;
            }
        });
        System.out.println();

        System.out.print("정렬 후 : ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i].number + " ");
        }

    }
    /*
    static Comparator<Numbers2> comp = new Comparator<Numbers2>() {
        @Override
        public int compare(Numbers2 o1, Numbers2 o2) {
            return o1.number - o2.number;
        }
    };

     */
}

class Numbers2 {

    Integer number;

    Numbers2(Integer number){
        this.number = number;
    }
}
