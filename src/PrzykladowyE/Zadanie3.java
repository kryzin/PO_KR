package PrzykladowyE;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Zadanie3 {
    public static void main(String[] args){
        System.out.println(lista("C:", "git"));
    }
    public static String lista(String path, String extension){
        ArrayList<String> arrayList = new ArrayList<>();
        File plik = new File(path);
//        System.out.println(Arrays.stream(plik.list()).toList());
        return Arrays.toString(plik.list((dir, name) -> !name.endsWith(extension)));
    }
}
