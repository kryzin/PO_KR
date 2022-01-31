package Z2;
import java.lang.Iterable;
import java.util.List;

public class Zadanie2Test {

    public static void main(String[] args){

        Integer[] obiekt = new Integer[2];
        obiekt[0] = 123;
        obiekt[1] = 345;

        print(obiekt);
    }

    public static <T> void print(T[] object){
        for(int i=0;i< object.length;i++){
            System.out.print(object[i] + ", ");
        }
    }
}
