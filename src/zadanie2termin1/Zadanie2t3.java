package zadanie2termin1;
import java.util.ArrayList;
import java.util.Iterator;

public class Zadanie2t3 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        wypiszCoDrugi(list);
    }

    public static<E extends Iterable<?>> void wypiszCoDrugi(E element)
    {
        Iterator<?> iterator = element.iterator();
        System.out.print(iterator.next() + ", ");
        while(iterator.hasNext())
        {
            iterator.next();
            if(iterator.hasNext())
            {
                System.out.print(iterator.next() + ", ");
            }
        }
    }
}
