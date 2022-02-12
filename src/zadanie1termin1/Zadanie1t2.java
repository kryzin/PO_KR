package zadanie1termin1;
import java.time.LocalTime;
import java.util.ArrayList;

public class Zadanie1t2 {
    public static void main(String[] args){

        Integer[] sortedInts = new Integer[]{5,6,7,6,5};  // tylko 7
        LocalTime[] czasy = new LocalTime[]{
                LocalTime.MIN,
                LocalTime.MIN.plusHours(2),
                LocalTime.MIN.plusHours(4),
                LocalTime.MIN.plusHours(6),
                LocalTime.MIN.plusHours(7)
        };  // caly

        System.out.println(ArrayUtil.removeRepated(sortedInts));
        System.out.println(ArrayUtil.removeRepated(czasy));
    }

    static class ArrayUtil{
        public static <T extends Comparable<T>> ArrayList<T> removeRepated(T[] array){
            ArrayList<T> list = new ArrayList<>();
            for(int i=0; i<array.length-1; i++){
                if(!list.contains(array[i])){
                    list.add(array[i]);
                }
            }
            return list;
        }
    }
}
