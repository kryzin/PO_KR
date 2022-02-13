package zadanie3probny;

import java.io.File;

public class Zadanie3t3 {
//    public static String bezRozszerzenia(File file)
//    {
//        String fileName = "";
//        if(file != null){
//            while(){
//                String name = file.getName();
//                fileName = name.replaceFirst("[.][^.]+$", "");
//            }
//
//        }
//        return fileName;
//    }

    public static void main(String[] args) {
        File path = new File("C:/Users/Karolina/Desktop");
        File[] files = path.listFiles();
//        System.out.println(bezRozszerzenia(files));
        String fileName = "";
        String[] bez = new String[100];
        for(int i=0; i<files.length-1; i++){
            String name = files[i].getName();
            fileName = name.replaceFirst("[.][^.]+$", "");
            bez[i] = files[i].getName();
        }
        System.out.println(bez);
    }
}