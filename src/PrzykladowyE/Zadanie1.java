package PrzykladowyE;
import java.time.LocalDate;
import java.math.BigInteger;
import java.util.Scanner;

public class Zadanie1 {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab){

        for (int i = 0; i < tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        BigInteger[] obiekt1 = new BigInteger[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<5)
        {
            obiekt1[i] = scanner.nextBigInteger();
            i++;
        }
        System.out.println(isSorted(obiekt1));

//        String[] obiekt2 = new String[5];
//        LocalDate[] obiekt3 = new LocalDate[5];

    }
}

