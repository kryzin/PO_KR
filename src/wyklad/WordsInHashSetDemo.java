package wyklad;
import java.util.*;

public class WordsInHashSetDemo
{
    public static void main(String[] args)
    {
//        klasa TreeSet zamiast HashSet
        Set<String> words = new TreeSet<>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}
// TreeSet 5908 unikalnych slow. 23 milisekund.
// HashSet 5908 unikalnych slow. 14 milisekund.