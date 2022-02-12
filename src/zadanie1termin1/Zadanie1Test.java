package zadanie1termin1;

import java.time.LocalTime;

public class Zadanie1Test {
    public static void main(String[] args){

        Integer[] sortedInts = new Integer[]{5,6,7,95,14566};  // true
        String[] stringss = new String[]{"Ala", "Maja", "Magdalena"};  // false
        LocalTime[] czasy = new LocalTime[]{
                LocalTime.MIN,
                LocalTime.MIN.plusHours(2),
                LocalTime.MIN.plusHours(4),
                LocalTime.MIN.plusHours(6),
                LocalTime.MIN.plusHours(7)
        };  // true

        System.out.println(ArrayUtil.isSorted(sortedInts));
        System.out.println(ArrayUtil.isSorted(czasy));
        System.out.println(ArrayUtil.isSorted(stringss));
    }

    static class ArrayUtil{
        public static <T extends Comparable<T>> boolean isSorted(T[] array){
            for(int i=0; i<array.length-1; i++){
                if (array[i+1].compareTo(array[i])<0){
                    return false;
                };
            }
            return true;
        }
    }
}
