package Collections.ComparatorAndComparable;

import java.util.Arrays;

public class ComparableSort {

    public static void main(String[] args) {
        Numbers[] numbers = new Numbers[10];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = new Numbers((int)(Math.random() * 100));
        }

        System.out.print("정렬 전 : ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i].number + " ");
        }
        Arrays.sort(numbers);
        System.out.println();
        System.out.print("정렬 후 : ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i].number + " ");
        }
    }
}

class Numbers implements Comparable<Numbers>{

    Integer number;

    Numbers(Integer number){
        this.number = number;
    }

    @Override
    public int compareTo(Numbers o) {
        return this.number - o.number;
    }
}
