package zadanie1termin1;
import java.time.LocalTime;

public class Zadanie1t3 {
    public static void main(String[] args){

        Integer[] sortedInts = new Integer[]{5,6,7,6,5};  // true
        LocalTime[] czasy = new LocalTime[]{
                LocalTime.MIN,
                LocalTime.MIN.plusHours(2),
                LocalTime.MIN.plusHours(4),
                LocalTime.MIN.plusHours(6),
                LocalTime.MIN.plusHours(7)
        };  // false

        System.out.println(ArrayUtil.jestPalindromem(sortedInts));
        System.out.println(ArrayUtil.jestPalindromem(czasy));
    }

    static class ArrayUtil{
        public static <T extends Comparable<T>> boolean jestPalindromem(T[] array){
            for(int i=0; i<array.length-1; i++) {
                for(int j= array.length-1; j>=0; j--){
                    if(array[j].compareTo(array[i])==0){
                        return true;
                    }else return false;
                }
            }return false;
        }
    }
}
