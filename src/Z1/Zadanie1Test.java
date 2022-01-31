package Z1;

import java.lang.Number;
import java.time.LocalTime;

public class Zadanie1Test {
    public static void main(String[] args){

        Integer[] obiekt1 = new Integer[3];
        LocalTime[] obiekt3 = new LocalTime[3];

        obiekt1[0] = 523534534;
        obiekt1[1] = 223534534;
        obiekt1[2] = 194234235;

        obiekt3[0] = LocalTime.NOON;
        obiekt3[1] = LocalTime.NOON.minusHours(5);
        obiekt3[2] = LocalTime.NOON.minusHours(11);

        System.out.println(isSorted(obiekt1));
        System.out.println(isSorted(obiekt3));



    }

    public static <T extends Comparable> boolean isSorted(T[] tab){

        for(int i=0; i<tab.length-1; i++){
            if (tab[i].compareTo(tab[i+1])<0){
                return false;
            };
        }
        return true;

    }
}
