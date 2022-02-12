import java.io.File;
import java.util.Arrays;

public class Zadanie3Test {
    public static void main(String[] args) {

        String path = "C:/Users/Karolina/Desktop/poltech";
        String[] files = fileList(path, ".png");

        for (String s:files){
            System.out.println(s);
        }
    }

    public static String[] fileList(String path, String extension){

        File file = new File(path);

        return file.list(((dir, name) -> !name.endsWith(extension)));
    }
}