package zadanie3probny;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;


public class Zadanie3t2 {
    public static void main(String[] args){
        String path = "C:/Users/Karolina/Desktop";
        File[] pliki = new File[]{};


    }

    public static File[] sortowanie(File[] tablica)
    {
        Comparator<File> comparator = (x, y) -> {
            if(x.isDirectory())
            {
                return -1;
            }
            else if(y.isDirectory())
            {
                return 1;
            }
            return x.compareTo(y);
        };

        Arrays.sort(tablica, comparator);
        return tablica;
    }
}
