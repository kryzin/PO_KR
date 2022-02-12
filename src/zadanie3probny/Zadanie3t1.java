package zadanie3probny;

import java.io.File;
import java.util.Arrays;

public class Zadanie3t1 {
    public static void main(String[] args) {

        String path = "C:/Users/Karolina/Desktop";
        String[] files = fileList(path);

        for (String s:files){
            System.out.println(s);
        }
    }

    public static String[] fileList(String path){

        File file = new File(path);

        return file.list(((dir, name) -> dir.isDirectory()));
    }
}