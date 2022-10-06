package edu1006.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        // ./는 현재 디렉토리
        FileReader fileReader = new FileReader("./a_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();

        System.out.println(files[0]);

        /*
        .\.git
         */
    }
}
