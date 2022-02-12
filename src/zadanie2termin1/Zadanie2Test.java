package zadanie2termin1;
import java.util.ArrayList;
import java.util.HashSet;

public class Zadanie2Test {
    public static void main(String[] args){

        ArrayList<Integer> i = new ArrayList<>();
        i.add(123);
        i.add(234);
        HashSet<Integer> j = new HashSet<>();
        j.add(4);
        j.add(6);
        j.add(7);

        print(j);
        print(i);
    }

    public static <T extends Iterable> void print(T t){
        ArrayList<Integer> i = new ArrayList<>();

        t.forEach(x -> {
            System.out.print(x);
            System.out.print(", ");
        });
    }
}
