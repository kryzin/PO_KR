package zadanie2termin1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Zadanie2t2 {
    public static void main(String[] args){

        ArrayList<Integer> i = new ArrayList<>();
        i.add(123);
        i.add(234);
        HashSet<Integer> j = new HashSet<>();
        j.add(4);
        j.add(6);
        j.add(7);

        printMarginal(j);
        printMarginal(i);
    }

    public static <T extends Iterable> void printMarginal(T t){
        Iterator<T> iterator = t.iterator();
        System.out.println("pierwszy: " + iterator.next());
        int x = 0;
        while(iterator.hasNext())
        {
            x += 1;
            iterator.next();
        }
        Iterator<T> iterator1 = t.iterator();
        while(x != 0)
        {
            iterator1.next();
            x -= 1;
        }
        System.out.println("ostatni: " + iterator1.next());
    }

}


